package com.dayorolands.expectactual.di

import androidx.lifecycle.viewmodel.compose.viewModel
import com.dayorolands.expectactual.dependencies.MyRepository
import com.dayorolands.expectactual.dependencies.MyRepositoryImpl
import com.dayorolands.expectactual.dependencies.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    /**
     * Another way to inject the repository would be
     * [singleOf(::MyRepositoryImpl).bind<MyRepository>()]
     * **/
    single {
        MyRepositoryImpl(get())
    }.bind<MyRepository>()

    viewModelOf(::MyViewModel)
}