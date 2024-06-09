package com.example.cifraclub.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cifraclub.screen.BodyAdd


sealed class Screen(val route: String) {
    object BodyAdd : Screen("Home")
}

@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.BodyAdd.route) {
        composable(Screen.BodyAdd.route) {
            BodyAdd()
        }
    }
}