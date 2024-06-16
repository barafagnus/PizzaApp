package com.kiparo.pizzaapp.presentation.features.home

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.kiparo.pizzaapp.R
import com.kiparo.pizzaapp.core.design.theme.padding_8
import com.kiparo.pizzaapp.core.design.theme.size_64


@Composable
fun ItemSection(
    sectionTitle: String,
    selected: Boolean,
    onClick: () -> Unit,
    containterColor: Color = if (selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.tertiary) {
    var color by remember { mutableStateOf(Color.Black) }


    Column(
        modifier = Modifier.clickable { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.size(width = size_64, height = size_64),
            colors = CardDefaults.cardColors(
                containerColor = if (selected) Color.Red else Color.Black
            )
        ) {

            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.food),
                    contentDescription = "asd"
                )
            }
        }

        Text(
            modifier = Modifier.padding(top = padding_8),
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.primary,
            text = sectionTitle
        )
    }
}

