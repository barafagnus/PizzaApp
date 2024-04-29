package com.kiparo.pizzaapp.app

import android.app.Application
import com.kiparo.pizzaapp.app.di.DiProvider
import com.kiparo.pizzaapp.app.di.GlobalDi
import com.kiparo.pizzaapp.app.di.GlobalDiImpl

class PizzaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        DiProvider.di = initDi()
    }

    private fun initDi(): GlobalDi {
        val di = GlobalDiImpl()

        // TODO Implement

        return di
    }
}
