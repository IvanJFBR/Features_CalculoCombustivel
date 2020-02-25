package com.ivstech.testelayout.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.ivstech.testelayout.R
import com.ivstech.testelayout.databinding.ActivityMainBinding
import com.ivstech.testelayout.enums.BottomCardsEnum
import com.ivstech.testelayout.ui.adapters.BottomCardsAdapter
import com.ivstech.testelayout.utils.MoneyTextWatcher
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        loadBottomCards()

        val mLocale = Locale("pt", "BR")

        etMoney.addTextChangedListener(MoneyTextWatcher(etMoney, mLocale))
        etGasolinePrice.addTextChangedListener(MoneyTextWatcher(etGasolinePrice, mLocale))
    }

    private fun loadBottomCards() {
        val adapter = BottomCardsAdapter(BottomCardsEnum.values().toList()) {

            when (it) {
                BottomCardsEnum.GASOLINE_ALCOHOL -> {

                }
                BottomCardsEnum.DEPOSIT -> TODO()
                BottomCardsEnum.TRANSFER -> TODO()
                BottomCardsEnum.PAY -> TODO()
                BottomCardsEnum.BLOCK_CARD -> TODO()
            }
        }
        binding.footerContainer.rvBottomCards.setHasFixedSize(true)
        binding.footerContainer.rvBottomCards.adapter = adapter
    }
}
