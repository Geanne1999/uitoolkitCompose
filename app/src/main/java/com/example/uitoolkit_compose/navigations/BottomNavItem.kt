package com.example.uitoolkit_compose.navigations

import androidx.compose.ui.graphics.painter.Painter
import com.example.uitoolkit_compose.R

sealed class BottomNavItem (var title:String, var icon:Int, var screen_resource:String) {
    object Home:BottomNavItem ("Home", R.drawable.ic_baseline_home_24,"home")
    object Settings: BottomNavItem("Settings",R.drawable.ic_baseline_settings_24,"settings")
}