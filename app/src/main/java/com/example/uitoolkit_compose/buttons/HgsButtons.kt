package com.example.uitoolkit_compose.buttons

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.uitoolkit_compose.base.HgsTypography
import com.example.uitoolkit_compose.values.HgsColors
import kotlinx.coroutines.Delay

enum class IconSide{RIGHT,LEFT, CENTER}

private val ButtonIconPadding = 16.dp

object HgsButtons {
    //declaring the main button
    @Composable
    fun HgsMainButton(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        shape:Shape= RectangleShape,
        size: ButtonSizes = HgsButtonSizes.RegularSize(),
        onClick: () -> Unit
    )= HgsButton(
        text = text,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        shape=shape,
        size = size,
        modifier = modifier,
        onClick = onClick
    )
    @Composable
    fun HgsProgressButton(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean=false,
        shape:Shape= RectangleShape,
        size: ButtonSizes = HgsButtonSizes.RegularSize(),
        onClick: () -> Unit,
    )= HgsProgressButtons(
        text = text,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        shape=shape,
        size = size,
        modifier = modifier,
        onClick = onClick,
        loading = loading
    )

    @Composable
    fun HgsGhostButton(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        shape:Shape= RectangleShape,
        size: ButtonSizes = HgsButtonSizes.RegularSize(),
        onClick: () -> Unit
    )= HgsButton(
        text = text,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        shape=shape,
        size = size,
        ripples=HgsButtonRipples.hgsGhostButton,
        border=HgsButtonBorders.hgsMainButtonGhost,
        colors=HgsButtonColors.hgsGhostButton,
        style=HgsTypography.HgsUiToolkitTextAppearanceHeadlineBoldButtonGhost,
        modifier = modifier,
        onClick = onClick
    )
    @Composable
    fun HgsProgressGhostButton(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        loading: Boolean=false,
        shape:Shape= RectangleShape,
        size: ButtonSizes = HgsButtonSizes.RegularSize(),
        onClick: () -> Unit
    )= HgsProgressButtons(
        text = text,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        shape=shape,
        size = size,
        ripples=HgsButtonRipples.hgsGhostButton,
        border=HgsButtonBorders.hgsMainButtonGhost,
        colors=HgsButtonColors.hgsGhostButton,
        style=HgsTypography.HgsUiToolkitTextAppearanceHeadlineBoldButtonGhost,
        modifier = modifier,
        onClick = onClick,
        loading = loading,
    )

    @Composable
    fun HgsRoundedButton(
        text: String,
        modifier: Modifier=Modifier,
        icon:Painter?=null,
        enabled: Boolean=true,
        shape: Shape= CircleShape,
        colors: ButtonColors = HgsButtonColors.hgsMainButton,
        iconSide: IconSide = IconSide.LEFT,
        size: ButtonSizes = HgsButtonSizes.RoundedButtonSize(),
        onClick: () -> Unit
    )= HgsButton(
        text = text,
        icon = icon,
        iconSide = iconSide,
        enabled = enabled,
        shape=shape,
        size = size,
        colors=colors,
        style=HgsTypography.HgsUiToolkitTextAppearanceHeadlineBoldButton,
        modifier = modifier
            .size(58 .dp),
        onClick = onClick
    )

    @Composable
    internal fun HgsProgressButtons(
        text: String,
        icon: Painter?,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        size: ButtonSizes = HgsButtonSizes.RegularSize(),
        loading: Boolean= false,
        shape: Shape= RectangleShape,
        colors: ButtonColors = HgsButtonColors.hgsMainButton,
        ripples: RippleTheme = HgsButtonRipples.hgsMainButton,
        border: DefaultBorderStr = HgsButtonBorders.none,
        elevation: ButtonElevation? = ButtonDefaults.elevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            disabledElevation = 0.dp
        ),
        indicatorSpacing: Dp = 8 .dp,
        //content: @Composable () -> Unit,
        style: TextStyle = HgsTypography.HgsUiToolkitTextAppearanceHeadlineBoldButton,
    ){
        var loadingTest by remember {
            mutableStateOf(loading)
        }
        val iconButton= @Composable{
            icon?.let {
                if(iconSide==IconSide.RIGHT) Spacer(Modifier.width(ButtonIconPadding))
                Icon(
                    painter = icon,
                    contentDescription = null,
                    modifier = Modifier.size(size.iconSize),
                    tint = HgsColors.hgsToolkitIconLoadingButton
                )
                if(iconSide==IconSide.LEFT) Spacer(Modifier.width(ButtonIconPadding))
            }
        }
        CompositionLocalProvider(LocalRippleTheme provides ripples ){
            Button(
                enabled = enabled,
                colors = colors,
                modifier = modifier
                    .widthIn(size.minWidth)
                    .sizeIn(size.minHeight),
                border = if (enabled) border.stroke else border.disabled,
                contentPadding = size.contentPadding,
                elevation = elevation,
                onClick = onClick,
                shape = shape
            ) {
                if(iconSide==IconSide.LEFT) iconButton()
                Text(
                    text = text,
                    style=style,
                    fontSize = size.fontSize,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )
                if(iconSide==IconSide.RIGHT) iconButton()
                val contentAlpha by animateFloatAsState(targetValue = if (loading) 0f else 1f)
                val loadingAlpha by animateFloatAsState(targetValue = if (loading) 1f else 0f)
                if(loading){
                    loadingTest=loading
                    Box(
                        contentAlignment = Alignment.Center,
                    ) {
                        HgsLoadingIndicator(
                            animating =loadingTest,
                            modifier = Modifier.graphicsLayer { alpha = loadingAlpha },
                            color = colors.contentColor(enabled = enabled).value,
                            indicatorSpacing = indicatorSpacing,
                        )
                        Box(
                            modifier = Modifier.graphicsLayer { alpha = contentAlpha }
                        ) {
                            //content()
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
        }
    }

    @Composable
    internal fun HgsButton(
        text: String,
        modifier: Modifier = Modifier,
        icon: Painter? = null,
        iconSide: IconSide = IconSide.LEFT,
        enabled: Boolean = true,
        shape: Shape= RectangleShape,
        colors: ButtonColors = HgsButtonColors.hgsMainButton,
        ripples: RippleTheme = HgsButtonRipples.hgsMainButton,
        border: DefaultBorderStr = HgsButtonBorders.none,
        size: ButtonSizes = HgsButtonSizes.RegularSize(),
        elevation: ButtonElevation? = ButtonDefaults.elevation(
            defaultElevation = 0.dp,
            pressedElevation = 0.dp,
            disabledElevation = 0.dp
        ),
        style: TextStyle = HgsTypography.HgsUiToolkitTextAppearanceHeadlineBoldButton,
        onClick: () -> Unit
    ){
        val iconButton= @Composable{
            icon?.let {
                Icon(
                    painter = icon,

                    contentDescription = null,
                    modifier = Modifier.size(size.iconSize)
                )
            }
        }
        CompositionLocalProvider(LocalRippleTheme provides ripples ){
            Button(
                enabled = enabled,
                colors = colors,
                modifier = modifier
                    .widthIn(size.minWidth)
                    .sizeIn(size.minHeight),
                border = if (enabled) border.stroke else border.disabled,
                contentPadding = size.contentPadding,
                elevation = elevation,
                onClick = onClick,
                shape = shape
            ) {
                if(iconSide==IconSide.LEFT) iconButton()
                Text(
                    text = text,
                    style=style,
                    fontSize = size.fontSize,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )
                if(iconSide==IconSide.RIGHT) iconButton()
            }
            Spacer(modifier = Modifier.width(16.dp))
        }
    }
}