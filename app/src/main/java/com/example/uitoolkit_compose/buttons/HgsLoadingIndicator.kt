package com.example.uitoolkit_compose.buttons

import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.uitoolkit_compose.values.HgsColors

@Composable
fun HgsLoadingIndicator(
    animating: Boolean,
    modifier: Modifier = Modifier,
    color: Color = HgsColors.hgsToolkitWhite,
    indicatorSpacing: Dp = 8 .dp,
) {
    val IndicatorSize = 24
    val AnimationDurationMillis = 300
//1
    val AnimationDelayMillis = AnimationDurationMillis / 1
    val animatedValues = List(1) { index ->
        var animatedValue by remember(key1 = Unit) { mutableStateOf(0f) }
        LaunchedEffect(key1 = Unit) {
            animate(
                initialValue = IndicatorSize / 2f,
                targetValue = -IndicatorSize / 2f,
                animationSpec=repeatable(iterations = 5, animation = tween(durationMillis = AnimationDurationMillis),
                    repeatMode = RepeatMode.Restart,initialStartOffset = StartOffset(AnimationDelayMillis * index)),
                /*animationSpec = infiniteRepeatable(
                    animation = tween(durationMillis = AnimationDurationMillis),
                    repeatMode = RepeatMode.Reverse,
                    initialStartOffset = StartOffset(AnimationDelayMillis * index),
                )*/
            ) { value, _ -> animatedValue = value }
        }
        animatedValue
    }
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        HgsCircularProgressInd(
            modifier = Modifier
            .padding(horizontal = indicatorSpacing)
            .width(IndicatorSize.dp)
            .aspectRatio(1f),
            isDisplayed = animating,
            color=color)
    }
}