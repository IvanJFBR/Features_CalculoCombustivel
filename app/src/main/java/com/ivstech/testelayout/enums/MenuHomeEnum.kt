package com.ivstech.testelayout.enums

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.ivstech.testelayout.R

enum class MenuHomeEnum(@DrawableRes val drawableId: Int?, @StringRes val title: Int, @StringRes val subTitle: Int = R.string.none) {
    HELP_ME(R.drawable.ic_help, R.string.gasoline_alcohol),
    NUACCOUNT_SETTINGS(R.drawable.ic_savings, R.string.supply),
    APP_SETTINGS(R.drawable.ic_phone, R.string.average_consumption)
}