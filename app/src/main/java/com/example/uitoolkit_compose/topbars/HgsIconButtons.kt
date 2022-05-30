package com.example.uitoolkit_compose.topbars

import android.graphics.drawable.Icon
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.uitoolkit_compose.R

object HgsNavIconButtons {
    @Composable
    fun HgsButtonPreviousPage(
        onClick: ()->Unit,
        modifier: Modifier=Modifier,
        contentDescription:String?,
        enabled:Boolean=true,
        interactionSource:MutableInteractionSource= remember {MutableInteractionSource()},
    ){
        IconButtons(onClick = onClick,
        modifier=modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        icon = {
            Icon(painter = painterResource(R.drawable.ic_baseline_arrow_back_24),
                contentDescription =contentDescription )
            }
        )
    }
}



@Composable
internal fun IconButtons(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    colors: TopBarColors = LocalHgsTopBarColors.current,
    icon: @Composable () -> Unit
) {
    IconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource
    ) {
        val color =
            if (enabled || colors.disabledIconColor == null) colors.iconColor else colors.disabledIconColor
        CompositionLocalProvider(
            LocalContentColor provides color,
            LocalContentAlpha provides ContentAlpha.high
        ) {
            icon()
        }
    }
}

internal fun (@Composable HgsNavIconButtons.() -> Unit)?.takeOrNull(): (@Composable () -> Unit)? {
    if (this == null) return null
    return {
       HgsNavIconButtons.this()
    }
}