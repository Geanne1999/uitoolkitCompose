package com.example.uitoolkit_compose.buttons

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.uitoolkit_compose.base.HgsTypography

class ButtonSizes(
    val fontSize: TextUnit,
    val minWidth: Dp,
    val minHeight: Dp,
    val iconSize: Dp,
    val contentPadding: PaddingValues
)
object HgsButtonSizes {
    @Composable
    fun RegularSize(
        modifier: Modifier=Modifier,
        fontSize: TextUnit = HgsTypography.HgsUiToolkitTextAppearanceHeadlineBold.fontSize,
        minWidth: Dp = 88.dp,
        minHeight: Dp = 48.dp,
        iconSize: Dp = 24.dp,
        contentPadding: PaddingValues = PaddingValues(start = 24.dp, end = 24.dp, top = 14.dp, bottom = 14.dp)
    ) = ButtonSizes(
        fontSize = fontSize,
        minWidth = minWidth,
        minHeight = minHeight,
        iconSize = iconSize,
        contentPadding = contentPadding
    )
    @Composable
    fun RoundedButtonSize(
        modifier: Modifier=Modifier,
        fontSize: TextUnit = HgsTypography.HgsUiToolkitTextAppearanceHeadlineBold.fontSize,
        minWidth: Dp = 88.dp,
        minHeight: Dp = 10.dp,
        iconSize: Dp = 24.dp,
        contentPadding: PaddingValues = PaddingValues(0.dp)
    ) = ButtonSizes(
        fontSize = fontSize,
        minWidth = minWidth,
        minHeight = minHeight,
        iconSize = iconSize,
        contentPadding = contentPadding
    )
}