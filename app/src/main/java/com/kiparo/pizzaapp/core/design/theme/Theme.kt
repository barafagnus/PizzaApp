/*
 * Copyright (c) 2023. Kiparo.ru
 */

package com.kiparo.pizzaapp.core.design.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

// For Students, read this:
// https://developer.android.com/jetpack/compose/designsystems/anatomy

private val darkColorScheme = darkColorScheme(
    primary = primary,
    secondary = secondary,
    background = background,
    surface = surface,
    onSurface = onSurface,
    inversePrimary = inversePrimary,
    onBackground = onBackground,
    primaryContainer = primaryContainer,
    tertiary = tertiary,
    error = error
)

private val lightColorScheme = lightColorScheme(
    primary = primary,
    secondary = secondary,
    background = background,
    surface = surface,
    onSurface = onSurface,
    inversePrimary = inversePrimary,
    onBackground = onBackground,
    primaryContainer = primaryContainer,
    tertiary = tertiary,
    error = error
)

@Composable
fun KiparoPizzaAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> darkColorScheme
        else -> lightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme, typography = typography, content = content
    )
}