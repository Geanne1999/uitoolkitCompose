package com.example.uitoolkit_compose.base

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.uitoolkit_compose.values.HgsColors

@Composable
fun SampleRow(
    fstItem:Boolean=false,
    lstItem:Boolean=false,
    modifier: Modifier=Modifier,
    color: Color = HgsColors.hgsToolkitWhite,
    content: @Composable RowScope.() ->Unit
) {
    Row(
        //Space between first child and last child
        horizontalArrangement = Arrangement.Center,
        modifier=modifier
            .fillMaxWidth()
            .background(color = color)
            .padding(top = if (fstItem) 8.dp else 5.dp, bottom = if (lstItem) 8.dp else 5.dp),
        content = content
    )
}