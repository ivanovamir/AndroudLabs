package com.example.createa30daysapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.createa30daysapp.R

data class Tip (
    @StringRes val name: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)

