package com.example.uitoolkit_compose.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.uitoolkit_compose.values.HgsButtonStatesDisabled
import com.example.uitoolkit_compose.values.HgsColors

class DefaultBorderStr(
    val stroke:BorderStroke?=null,
    val disabled:BorderStroke?=stroke
)

internal object HgsButtonBorders {
    val hgsMainButtonGhost: DefaultBorderStr
        @Composable
        get() = DefaultBorderStr(
            stroke = BorderStroke(
                width = 2.dp,
                color = HgsColors.hgsToolkitBlazeOrangePrimary
            ),
            disabled = BorderStroke(
                width = 2.dp,
                color = HgsColors.hgsToolkitSilver.copy(alpha = HgsButtonStatesDisabled)
            )
        )

    val none: DefaultBorderStr
        @Composable
        get() = DefaultBorderStr()
}