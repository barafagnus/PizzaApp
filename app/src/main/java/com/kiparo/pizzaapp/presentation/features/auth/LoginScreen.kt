package com.kiparo.pizzaapp.presentation.features.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.kiparo.pizzaapp.R
import com.kiparo.pizzaapp.core.design.theme.KiparoPizzaAppTheme
import com.kiparo.pizzaapp.core.design.theme.padding_32
import com.kiparo.pizzaapp.presentation.features.start.StarterScreen
import com.kiparo.pizzaapp.presentation.features.start.bottomContent
import com.kiparo.pizzaapp.presentation.features.start.logo
import com.kiparo.pizzaapp.presentation.features.start.topTitle

@Composable
fun loginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        MaterialTheme.colorScheme.primary,
                        MaterialTheme.colorScheme.primaryContainer
                    )
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        topTitle(
            modifier = Modifier
                .padding(top = padding_32)
                .fillMaxWidth()
        )

        login(
            modifier = Modifier
                .padding(top = padding_32)
                .fillMaxWidth()
        )

    }
}

@Composable
fun login(modifier: Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.login),
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.background
        )

//        TextField(
//            value = {},
//            onValueChange = {},
//            label = {Text("asd")})
    }

}

@Preview(showBackground = true)
@Composable
fun loginScreenPreview() {
    KiparoPizzaAppTheme {
        loginScreen()
    }
}