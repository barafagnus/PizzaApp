/*
 * Copyright (c) 2023. Kiparo.ru
 */

package com.kiparo.pizzaapp.core.design.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kiparo.pizzaapp.R

// For Students, read this:
// https://developer.android.com/jetpack/compose/designsystems/material3#typography



val typography = Typography(
    bodySmall = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W400,
        fontSize = 10.sp,
        lineHeight = 15.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W400,
        fontSize = 15.sp,
        lineHeight = 23.sp,
        letterSpacing = 0.sp
    ),
    labelMedium = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 14.sp,
        lineHeight = 23.sp,
        letterSpacing = 0.sp
    ),
    labelLarge = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp,
        lineHeight = 30.sp,
        letterSpacing = 0.sp
    ),
    titleSmall = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 17.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 32.sp,
        lineHeight = 15.sp,
        letterSpacing = 0.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = mochiypopone,
        fontWeight = FontWeight.W400,
        fontSize = 36.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp
    ),

)

val Typography.bodyLargeBold: TextStyle
@Composable
get() {
    return TextStyle(
        fontFamily = poppinsFamily,
        fontWeight = FontWeight.W600,
        fontSize = 15.sp,
        lineHeight = 23.sp,
        letterSpacing = 0.sp
    )
}