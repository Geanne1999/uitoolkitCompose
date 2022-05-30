package com.example.uitoolkit_compose.base

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.example.uitoolkit_compose.values.HgsColors

class AppColors(
    textTitleColor1: Color,
    textTitleColor2:Color,
    textTitleColor3:Color,
    buttonColorCarrot:Color
) {
    var textTitleColor1 by mutableStateOf(textTitleColor1)
        private set
    var textTitleColor2 by mutableStateOf(textTitleColor2)
        private set
    var textTitleColor3 by mutableStateOf(textTitleColor3)
        private set
    var buttonColorCarrot by mutableStateOf(buttonColorCarrot)
        private set
    fun copy(
        textTitleColor1: Color = this.textTitleColor1,
        textTitleColor2: Color = this.textTitleColor2,
        textTitleColor3: Color=this.textTitleColor3,
        buttonColorCarrot: Color=this.buttonColorCarrot
    ): AppColors = AppColors(
        textTitleColor1,
        textTitleColor2,
        textTitleColor3,
        buttonColorCarrot
    )
    fun updateColorsFrom(other: AppColors) {
        textTitleColor1 = other.textTitleColor1
        textTitleColor2 = other.textTitleColor2
        textTitleColor3 = other.textTitleColor3
        buttonColorCarrot=other.buttonColorCarrot
    }
}

fun allColors(
    textTitleColor1: Color = HgsColors.hgsToolkitTundora,
    textTitleColor2: Color= HgsColors.hgsToolkitCongressBlueSecondary,
    textTitleColor3: Color =HgsColors.hgsToolkitCeruleanSecondary,
    buttonColorCarrot:Color= HgsColors.hgsToolkitBlazeOrangePrimary
): AppColors = AppColors(
    textTitleColor1 = textTitleColor1,
    textTitleColor2 = textTitleColor2,
    textTitleColor3 = textTitleColor3,
    buttonColorCarrot=buttonColorCarrot
)

internal val LocalColors = staticCompositionLocalOf{ allColors()}