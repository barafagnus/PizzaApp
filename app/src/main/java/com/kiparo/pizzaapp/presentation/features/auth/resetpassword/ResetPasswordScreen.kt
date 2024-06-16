package com.kiparo.pizzaapp.presentation.features.auth.resetpassword

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.kiparo.pizzaapp.R
import com.kiparo.pizzaapp.core.design.theme.KiparoPizzaAppTheme
import com.kiparo.pizzaapp.core.design.theme.corner_8
import com.kiparo.pizzaapp.core.design.theme.height_46
import com.kiparo.pizzaapp.core.design.theme.padding_16
import com.kiparo.pizzaapp.core.design.theme.padding_24
import com.kiparo.pizzaapp.core.design.theme.padding_32
import com.kiparo.pizzaapp.core.design.theme.padding_64
import com.kiparo.pizzaapp.core.design.theme.space_4
import com.kiparo.pizzaapp.presentation.features.start.TopTitle

@Composable
fun ResetPasswordScreen() {
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
        TopTitle(
            modifier = Modifier
                .padding(top = padding_32)
                .fillMaxWidth()
        )

        ResetPassword(
            modifier = Modifier
                .padding(top = padding_32)
                .fillMaxWidth()
        )

    }
}

@Composable
fun ResetPassword(modifier: Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.reset_password),
            style = MaterialTheme.typography.headlineMedium,
            color = MaterialTheme.colorScheme.background
        )

        var mail by remember { mutableStateOf("Email") }

        TextField(
            modifier = Modifier
                .padding(top = padding_24, start = padding_16, end = padding_16)
                .fillMaxWidth()
                .onFocusChanged {
                    if (it.isFocused) {
                        mail = ""
                    }
                },
            shape = RoundedCornerShape(corner_8),
            value = mail,
            onValueChange = { mail = it },
            leadingIcon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.ic_mail),
                    contentDescription = stringResource(
                        id = R.string.mail
                    )
                )
            }
        )


        Button(
            modifier = Modifier
                .padding(top = padding_32, start = padding_16, end = padding_16)
                .height(height_46)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary
            ),
            onClick = { /*TODO*/ },

            ) {
            Text(
                text = stringResource(id = R.string.send),
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.background
            )
        }

        Row(modifier = Modifier.padding(start = padding_64, end = padding_64, top = padding_24)) {
            Text(
                text = stringResource(id = R.string.already_member),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.background
            )
            Spacer(modifier = Modifier.width(space_4))
            ClickableText(
                text = AnnotatedString(stringResource(id = R.string.register)),
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.W600,
                    color = MaterialTheme.colorScheme.background
                ),
                onClick = {/*TODO*/ }
            )
            Spacer(modifier = Modifier.width(space_4))
            Text(
                text = stringResource(id = R.string.here),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.background
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun resetPasswordPreview() {
    KiparoPizzaAppTheme {
        ResetPasswordScreen()
    }
}