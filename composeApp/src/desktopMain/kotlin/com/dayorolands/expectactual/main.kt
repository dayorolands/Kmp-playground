package com.dayorolands.expectactual

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.dayorolands.expectactual.di.initKoin

fun main() = application {
    initKoin()
    Window(
        onCloseRequest = ::exitApplication,
        title = "ExpectActualProject"
    ) {
        App(
            batteryManager = remember { BatteryManager() }
        )
    }
}