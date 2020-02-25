package com.ivstech.testelayout.utils

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import java.lang.ref.WeakReference
import java.util.*
import android.R.attr.editable
import java.math.BigDecimal
import java.text.NumberFormat


class MoneyTextWatcher(editText: EditText, locale: Locale?) : TextWatcher {
    private var editTextWeakReference : WeakReference<EditText> = WeakReference(editText)
    private var locale : Locale? = if (locale != null) locale else Locale.getDefault()

    override fun afterTextChanged(s: Editable?) {
        val editText = editTextWeakReference.get() ?: return
        editText.removeTextChangedListener(this)

        val parsed = parseToBigDecimal(s.toString(), locale)
        val formatted = NumberFormat.getCurrencyInstance(locale).format(parsed)
        // NumberFormat.getNumberInstance(locale).format(parsed); // sem o simbolo de moeda

        editText.setText(formatted)
        editText.setSelection(formatted.length)
        editText.addTextChangedListener(this)
    }

    private fun parseToBigDecimal(value: String, locale: Locale?): BigDecimal {
        val replaceable =
            String.format("[%s,.\\s]", NumberFormat.getCurrencyInstance(locale).currency.symbol)

        val cleanString = value.replace(replaceable.toRegex(), "")

        return BigDecimal(cleanString).setScale(
            2, BigDecimal.ROUND_FLOOR
        ).divide(
            BigDecimal(100), BigDecimal.ROUND_FLOOR
        )
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
    }
}