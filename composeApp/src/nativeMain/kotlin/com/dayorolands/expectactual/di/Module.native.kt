package com.dayorolands.expectactual.di

import com.dayorolands.expectactual.dependencies.DbClient
import com.dayorolands.expectactual.dependencies.MyViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::DbClient)
}