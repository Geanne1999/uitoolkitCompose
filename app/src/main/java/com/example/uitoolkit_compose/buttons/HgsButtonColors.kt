package com.example.uitoolkit_compose.buttons

import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import com.example.uitoolkit_compose.values.HgsButtonStatesDisabled
import com.example.uitoolkit_compose.values.HgsColors

object HgsButtonColors {
    val hgsMainButton:ButtonColors
        @Composable
        get() =ButtonDefaults.buttonColors (
           backgroundColor = HgsColors.hgsToolkitBlazeOrangePrimary,
            contentColor = HgsColors.hgsToolkitWhite,
            disabledBackgroundColor =HgsColors.hgsToolkitSilver.copy(alpha = HgsButtonStatesDisabled),
            disabledContentColor =HgsColors.hgsToolkitWhite.copy(alpha = HgsButtonStatesDisabled)
        )

    val hgsGhostButton:ButtonColors
        @Composable
        get() =ButtonDefaults.buttonColors (
            backgroundColor = HgsColors.hgsToolkitWhite,
            contentColor = HgsColors.hgsToolkitBlazeOrangePrimary,
            disabledBackgroundColor =HgsColors.hgsToolkitWhite.copy(alpha = HgsButtonStatesDisabled),
            disabledContentColor =HgsColors.hgsToolkitSilver.copy(alpha = HgsButtonStatesDisabled)
        )
}