package com.example.cat2navapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cat2navapp.ui.theme.screens.bmiCalc.BmiScreen
import com.example.cat2navapp.ui.theme.screens.calculator.CalculatorScreen
import com.example.cat2navapp.ui.theme.screens.home.HomeScreen
import com.example.cat2navapp.ui.theme.screens.intent.IntentScreen


@Composable
fun AppNavHost(
    modifier: Modifier=Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_HOME
) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_BMI) {
            BmiScreen(navController = navController)
        }
        composable(ROUTE_CALCULATOR) {
            CalculatorScreen(navController = navController)
        }
        composable(ROUTE_INTENT) {
            IntentScreen(navController = navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(navController = navController)
        }
    }
}


