package com.example.uitoolkit_compose.buttons

import android.os.Build
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.Composable
import com.example.uitoolkit_compose.values.HgsColors

internal object HgsButtonRipples {
    val hgsMainButton: RippleTheme
        @Composable
        get() = object : RippleTheme {
            @Composable
            override fun defaultColor() = HgsColors.hgsToolkitNeonCarrotPrimary

            @Composable
            override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha())
        }
    val hgsGhostButton: RippleTheme
        @Composable
        get() = object : RippleTheme {
            @Composable
            override fun defaultColor() = HgsColors.hgsToolkitNeonCarrotPrimary

            @Composable
            override fun rippleAlpha(): RippleAlpha = RippleAlpha(1f, 1f, 1f, getAlpha())
        }

    //because in the current android, the ripple animation is split in two sections
    // so, we need to divide the original alpha for 2 also motivated by this
    private fun getAlpha(alpha: Float = 1f): Float =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) alpha / 2f else alpha
}