package com.example.uitoolkit_compose.navigations

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.uitoolkit_compose.base.HgsTypography
import com.example.uitoolkit_compose.values.HgsColors

object HgsNavigations{
    @Composable
    fun HgsBottomNavigation(navController:NavController) {
        //declare all the screens in the bottom navigation
        val items= listOf(
            BottomNavItem.Home,
            BottomNavItem.Settings
        )

        BottomNavigation(
            backgroundColor = HgsColors.hgsToolkitLochmaraSecondary,
            contentColor =HgsColors.hgsToolkitWhite
        ) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route
            items.forEach { item ->
                BottomNavigationItem(
                    icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                    label = { Text(text = item.title,style=HgsTypography.HgsUiToolkitTextAppearanceBodyNavigation) },
                    selectedContentColor = HgsColors.hgsToolkitWhite,
                    unselectedContentColor = HgsColors.hgsToolkitWhite60,
                    alwaysShowLabel = true,
                    selected = currentRoute == item.screen_resource,
                    onClick = {
                        navController.navigate(item.screen_resource) {

                            navController.graph.startDestinationRoute?.let { screen_route ->
                                popUpTo(screen_route) {
                                    saveState = true
                                }
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                )
            }
        }
    }

    @Composable
    fun HgsTabsNav(){

    }
}