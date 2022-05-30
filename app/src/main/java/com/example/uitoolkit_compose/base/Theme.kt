package com.example.uitoolkit_compose.base

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

object Theme{
    val colors: AppColors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current
}

