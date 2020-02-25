package com.ivstech.testelayout.enums

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.ivstech.testelayout.R

enum class BottomCardsEnum(@DrawableRes val drawableId: Int?, @StringRes val title: Int, val order: Int = 0) {
    GASOLINE_ALCOHOL(R.drawable.ic_gasoline_alcohol, R.string.gasoline_alcohol),
    DEPOSIT(R.drawable.ic_supply, R.string.supply),
    TRANSFER(R.drawable.ic_average_consumption, R.string.average_consumption),
    PAY(R.drawable.ic_initial_final_average, R.string.initial_final_average),
    BLOCK_CARD(R.drawable.ic_path_value, R.string.path_value)
}