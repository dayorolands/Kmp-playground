package com.dayorolands.expectactual

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ExpectActualProject"
    ) {
        App(
            batteryManager = remember { BatteryManager() }
        )
    }
}