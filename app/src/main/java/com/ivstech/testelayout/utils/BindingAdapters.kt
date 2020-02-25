package com.ivstech.testelayout.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter


@BindingAdapter("app:srcIcon")
fun ImageView.srcIcon(resourceId: Int?) {
    resourceId?.let { setImageResource(it) }
}

