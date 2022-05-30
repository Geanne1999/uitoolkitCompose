package com.example.uitoolkit_compose.texts

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.uitoolkit_compose.base.HgsTypography

enum class ExpandState{VISIBLE,HIDDEN}

@Composable
fun DetailExpandable(
    title:String,
    defaultState: ExpandState=ExpandState.HIDDEN,
    content: @Composable ColumnScope.() -> Unit
    ) {
    var isContentVisible by rememberSaveable { mutableStateOf(defaultState) } 
    
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                if (isContentVisible == ExpandState.VISIBLE) ExpandState.HIDDEN else ExpandState.VISIBLE
            },
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = title, style = HgsTypography.HgsUiToolkitTextAppearanceCaption)
        AnimatedVisibility(visible = isContentVisible ==ExpandState.VISIBLE) {
            Column {
                content()
            }
        }
    }
}