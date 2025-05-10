package com.dayorolands.expectactual

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dayorolands.expectactual.dependencies.MyViewModel
import expectactualproject.composeapp.generated.resources.Res
import expectactualproject.composeapp.generated.resources.bag_circle
import expectactualproject.composeapp.generated.resources.hello_word
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext
import org.koin.compose.koinInject
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
@Preview
fun App(
    batteryManager: BatteryManager
) {
    MaterialTheme {
        KoinContext {
            NavHost(
                navController = rememberNavController(),
                startDestination = "home"
            ) {
                composable("home") {
                    val viewModel = koinViewModel<MyViewModel>()
                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "The current battery level is ${batteryManager.getBatteryLevel()}"
                        )
                        Spacer(Modifier.height(10.dp))
                        Text(
                            text = "String from resource: ${stringResource(Res.string.hello_word)}"
                        )
                        Spacer(Modifier.height(10.dp))
                        Image(
                            painter = painterResource(Res.drawable.bag_circle),
                            contentDescription = null
                        )
                        Text(
                            text = "String from viewModel: ${viewModel.getHelloWorldString()}"
                        )
                    }
                }
            }
        }
    }
}