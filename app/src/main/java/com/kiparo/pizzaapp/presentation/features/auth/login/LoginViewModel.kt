package com.kiparo.pizzaapp.presentation.features.auth.login

import androidx.compose.runtime.Stable
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import com.kiparo.pizzaapp.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

@Stable
data class LoginUiState(
    val mail: String,
    val password: String
)

class LoginViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(
        LoginUiState(
            mail = "Email",
            password = "Password"
        )
    )
    fun onMailChange(mail: String) {
        _uiState.update { currentState ->
            currentState.copy(
                mail = mail
            )
        }
    }

    val uiState: StateFlow<LoginUiState> = _uiState
}