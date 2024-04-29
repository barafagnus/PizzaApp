/*
 * Copyright (c) 2023. Kiparo academy
 */

package com.kiparo.pizzaapp.domain.repository

import com.kiparo.pizzaapp.domain.models.MenuItem
import com.kiparo.pizzaapp.domain.models.MenuSection

interface MenuRepository {
    suspend fun getMenu(): List<MenuItem>

    suspend fun getSections() : List<MenuSection>
}
