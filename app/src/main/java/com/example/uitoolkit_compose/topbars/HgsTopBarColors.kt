package com.example.uitoolkit_compose.topbars

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import com.example.uitoolkit_compose.values.HgsColors

@Immutable
class TopBarColors(
    val background: Color,
    val contentColor: Color,
    val iconColor: Color,
    val disabledIconColor: Color?,
    val inputColor: Color?,
    val cursorColor: Color?
)

object HgsTopBarColors{
    @Composable
    fun hgsMainButtonColors(
        background: Color = HgsColors.hgsToolkitBlazeOrangePrimary,
        contentColor: Color=HgsColors.hgsToolkitWhite,
        iconColor: Color=HgsColors.hgsToolkitWhite
    ):TopBarColors= TopBarColors(
        background=background,
        contentColor=contentColor,
        iconColor=iconColor,
        disabledIconColor = null,
        inputColor = null,
        cursorColor = null
    )
}

internal val LocalHgsTopBarColors = compositionLocalOf<TopBarColors> {
    error("No TopBarsColors provided")
}