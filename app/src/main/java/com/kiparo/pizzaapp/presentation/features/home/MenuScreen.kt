package com.kiparo.pizzaapp.presentation.features.home

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.kiparo.pizzaapp.R
import com.kiparo.pizzaapp.core.design.theme.KiparoPizzaAppTheme
import com.kiparo.pizzaapp.core.design.theme.height_75
import com.kiparo.pizzaapp.core.design.theme.padding_16
import com.kiparo.pizzaapp.core.design.theme.padding_8
import com.kiparo.pizzaapp.core.design.theme.space_8
import com.kiparo.pizzaapp.data.network.model.SectionItemNetwork
import com.kiparo.pizzaapp.domain.models.MenuSection
import com.kiparo.pizzaapp.domain.usecases.GetMenuSectionsUseCase

@Composable
fun MenuScreen() {
    Column(modifier = Modifier.padding(top = padding_16, start = padding_16, end = padding_16)) {
        Text(
            modifier = Modifier,
            text = stringResource(id = R.string.menu),
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.primary
        )

        SectionMenu(modifier = Modifier.padding(top = padding_16))


    }


}


@Composable
fun SectionMenu(modifier: Modifier) {
    val itemsList =
        remember {
            mutableStateListOf(
                MenuSection(title = "All", image = ""),
                MenuSection(title = "Pizza", image = ""),
                 MenuSection(title = "Burger", image = ""),
                 MenuSection(title = "Dessert", image = ""),
                 MenuSection(title = "Ice cream", image = ""),
                 MenuSection(title = "A", image = ""),
                 MenuSection(title = "B", image = ""),
                 MenuSection(title = "C", image = ""),
            )
        }

    var selected by remember { mutableStateOf(false) }

    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(space = space_8)
    ) {
        itemsIndexed(itemsList) { index, item ->

            ItemSection(sectionTitle = item.title, selected = selected, onClick = {selected = !selected})
        }

    }
}

@Composable
fun MenuItem(lazyItemScope: LazyItemScope) {
    val itemName by remember {
        mutableStateOf(
            listOf(
                "All",
                "Pizza",
                "Burger",
                "Dessert",
                "Ice cream"
            )
        )
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Card(
            modifier = Modifier.size(width = height_75, height = height_75),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surface
            )
        ) {
            Text(text = "ASDAD")
        }

        Text(
            modifier = Modifier.padding(top = padding_8),
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.primary,
            text = "M_item"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MenuScreenPreview() {
    KiparoPizzaAppTheme {
        MenuScreen()
    }
}