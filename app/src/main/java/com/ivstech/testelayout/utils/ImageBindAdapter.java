package com.ivstech.testelayout.utils;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class ImageBindAdapter {
    @BindingAdapter("imageResource")
    public static void setImageResource(ImageView imageView, int resource){
        imageView.setImageResource(resource);
    }
}
