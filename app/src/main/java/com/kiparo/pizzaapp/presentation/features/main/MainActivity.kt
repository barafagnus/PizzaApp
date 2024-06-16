/*
 * Copyright (c) 2023. Kiparo.com
 */

package com.kiparo.pizzaapp.presentation.features.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kiparo.pizzaapp.core.design.theme.KiparoPizzaAppTheme
import com.kiparo.pizzaapp.presentation.features.auth.login.LoginScreen
import com.kiparo.pizzaapp.presentation.features.auth.login.LoginViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KiparoPizzaAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val loginViewModel: LoginViewModel = viewModel()
                    val loginUiState by loginViewModel.uiState.collectAsStateWithLifecycle()
                    LoginScreen(
                        uiState = loginUiState,
                        onMailChange = loginViewModel::onMailChange,
                        onPasswordChange = {},
                        onFocusChange = {}
                    ) {

                    }
                }
            }
        }
    }
}
