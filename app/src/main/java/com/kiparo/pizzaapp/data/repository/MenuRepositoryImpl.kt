/*
 * Copyright (c) 2023. Kiparo academy
 */

package com.kiparo.pizzaapp.data.repository

import com.kiparo.pizzaapp.data.network.api.KiparoPizzaApi
import com.kiparo.pizzaapp.domain.models.MenuItem
import com.kiparo.pizzaapp.domain.models.MenuSection
import com.kiparo.pizzaapp.domain.repository.MenuRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

class MenuRepositoryImpl(
    private val pizzaApi: KiparoPizzaApi,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : MenuRepository {
    override suspend fun getMenu(): List<MenuItem> {
        TODO("Not yet implemented")
    }

    override suspend fun getSections(): List<MenuSection> {
        TODO("Not yet implemented")
    }
}


