package com.kiparo.pizzaapp.domain.usecases

import com.kiparo.pizzaapp.domain.models.MenuItem
import com.kiparo.pizzaapp.domain.repository.MenuRepository

class GetMenuItemsUseCase(
    private val repository: MenuRepository
) : UseCaseWithParams<List<MenuItem>, String> {

    override suspend fun execute(filterBySection: String): List<MenuItem> {
        return repository.getMenu()
    }
}