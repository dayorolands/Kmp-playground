package com.dayorolands.expectactual

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.dayorolands.expectactual.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App(
        batteryManager = remember { BatteryManager() }
    )
}