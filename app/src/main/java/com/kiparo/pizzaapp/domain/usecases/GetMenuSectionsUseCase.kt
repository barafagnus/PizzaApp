package com.kiparo.pizzaapp.domain.usecases

import com.kiparo.pizzaapp.domain.models.MenuSection
import com.kiparo.pizzaapp.domain.repository.MenuRepository

class GetMenuSectionsUseCase(
    private val repository: MenuRepository,
) : UseCaseWithoutParams<List<MenuSection>> {

    override suspend fun execute(): List<MenuSection> {
        return repository.getSections()
    }
}