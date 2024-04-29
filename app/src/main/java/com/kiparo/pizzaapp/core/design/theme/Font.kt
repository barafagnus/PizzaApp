/*
 * Copyright (c) 2023. Kiparo.ru
 */

package com.kiparo.pizzaapp.core.design.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.kiparo.pizzaapp.R

// For Students, read this:
// https://developer.android.com/jetpack/compose/text/fonts

val poppinsFamily = FontFamily(
    Font(
        resId = R.font.poppins_black,
        weight = FontWeight.W900,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.poppins_extrabold,
        weight = FontWeight.W800,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.poppins_bold,
        weight = FontWeight.W700,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.poppins_semibold,
        weight = FontWeight.W600,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.poppins_medium,
        weight = FontWeight.W500,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.poppins_regular,
        weight = FontWeight.W400,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.poppins_light,
        weight = FontWeight.W300,
        style = FontStyle.Normal
    ),
    Font(
        resId = R.font.poppins_extralight,
        weight = FontWeight.W200,
        style = FontStyle.Normal
    )
)

val mochiypopone = FontFamily(
    Font(
        resId = R.font.mochiypopone_regular,
        weight = FontWeight.W400,
        style = FontStyle.Normal
    )
)