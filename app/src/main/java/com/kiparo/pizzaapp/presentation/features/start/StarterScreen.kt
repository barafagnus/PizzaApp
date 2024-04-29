package com.kiparo.pizzaapp.presentation.features.start

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kiparo.pizzaapp.R
import com.kiparo.pizzaapp.core.design.theme.KiparoPizzaAppTheme
import com.kiparo.pizzaapp.core.design.theme.height_264
import com.kiparo.pizzaapp.core.design.theme.height_46
import com.kiparo.pizzaapp.core.design.theme.height_75
import com.kiparo.pizzaapp.core.design.theme.padding_32
import com.kiparo.pizzaapp.core.design.theme.padding_40
import com.kiparo.pizzaapp.core.design.theme.width_104
import com.kiparo.pizzaapp.core.design.theme.width_216
import com.kiparo.pizzaapp.core.design.theme.width_264


@Composable
fun StarterScreen(
    onGetStartedClicked: () -> Unit
) {
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
        logo()
        bottomContent()
    }

}

@Composable
fun topTitle(modifier: Modifier) {
    Image(
        modifier = modifier.size(width = width_104, height = height_75),
        painter = painterResource(id = R.drawable.donut),
        contentDescription = stringResource(
            id = R.string.auth_title
        )
    )
    MultipleStylesInText()
}

@Composable
fun logo() {
    Image(
        modifier = Modifier
            .size(width = width_264, height = height_264)
            .padding(top = padding_32),
        painter = painterResource(id = R.drawable.pizza),
        contentDescription = stringResource(
            id = R.string.pizza
        )
    )
}

@Composable
fun bottomContent() {
    Text(
        modifier = Modifier.padding(top = padding_32),
        text = stringResource(id = R.string.enjoy),
        style = MaterialTheme.typography.headlineLarge,
        color = MaterialTheme.colorScheme.inversePrimary
    )
    Text(
        text = stringResource(id = R.string.your_meal),
        style = MaterialTheme.typography.headlineLarge,
        color = MaterialTheme.colorScheme.background
    )
    Button(
        modifier = Modifier
            .padding(top = padding_40)
            .size(width = width_216, height = height_46),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondary
        ),
        onClick = { /*TODO*/ },

        ) {
        Text(
            text = stringResource(id = R.string.get_started),
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.background
        )
    }
}


@Composable
fun MultipleStylesInText() {
    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(color = MaterialTheme.colorScheme.inversePrimary)) {
                append("P")
            }
            append("izza")

            withStyle(
                style = SpanStyle(
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.inversePrimary
                )
            ) {
                append("A")
            }
            append("pp")
        },
        style = MaterialTheme.typography.headlineLarge,
        color = MaterialTheme.colorScheme.background
    )
}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview() {
    KiparoPizzaAppTheme {
        StarterScreen(onGetStartedClicked = {})
    }
}