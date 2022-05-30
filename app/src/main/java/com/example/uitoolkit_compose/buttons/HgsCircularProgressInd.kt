package com.example.uitoolkit_compose.buttons

import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.uitoolkit_compose.values.HgsColors

@Composable
fun HgsCircularProgressInd (
    isDisplayed:Boolean,
    color: Color,
    modifier: Modifier = Modifier,
){
    if(isDisplayed){
        Row(
            modifier = modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ){
            CircularProgressIndicator(
                color = color
            )
        }
    }
}