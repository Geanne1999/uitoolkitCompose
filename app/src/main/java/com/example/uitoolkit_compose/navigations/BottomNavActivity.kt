package com.example.uitoolkit_compose.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class BottomNavActivity {
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavItem.Home.screen_resource) {
        composable(BottomNavItem.Home.screen_resource) {
            //Call the composable content that you wanna show
        }
        composable(BottomNavItem.Settings.screen_resource) {
            //Call the composable content that you wanna show
        }
    }
}