package com.example.uitoolkit_compose.topbars

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.min
import kotlin.math.min

object HgsTopBars {
    private const val LIMIT_ACTIONS = 3
    //almost all the parameters of icons and buttons can be null to give more freedom to the button utilisation
    @Composable
    fun HgsPrimaryTopBar(
        title: String,
        modifier: Modifier = Modifier,
        maxActions: Int = 2,
        actions: List<ActionItem> = emptyList(),
        isContextualized: Boolean = false,
        expandedMenu: MutableState<Boolean> = remember { mutableStateOf(false) },
        onDismissOverflowMenu: (() -> Unit)? = null,
        //overflowIcon: (@Composable HgsIconButtons.() -> Unit)? = null, different object ici
        navigationIcon: (@Composable HgsNavIconButtons.() -> Unit)? = null
    ){
        val colors = if (isContextualized) null else HgsTopBarColors.hgsMainButtonColors()
        CompositionLocalProvider(LocalHgsTopBarColors provides colors!!) {
            TopAppBar (
                title = { Text(text = title)},
                modifier=modifier,
                navigationIcon = navigationIcon.takeOrNull(),
                actions={
                    var showAsActionItems=actions.take(min(LIMIT_ACTIONS,maxActions))
                    var overFlowItems=actions.subtract(showAsActionItems.toSet()).toList()
                    showAsActionItems.forEach {
                        if (it.icon != null) {
                            IconButtons(onClick = { it.onClick() }) {
                                Icon(
                                    painter = it.icon,
                                    contentDescription = it.contentDescription,
                                    tint = colors.iconColor
                                )
                            }
                        } else {
                            TextButton(
                                onClick = { it.onClick() },
                                content = { it.content() },
                                colors = ButtonDefaults.textButtonColors(contentColor = colors.contentColor)
                                )
                            }
                        }
                    },
                backgroundColor = colors.background,
                contentColor = colors.contentColor
            )
        }
    }
}
open class ActionItem(
    //to implement the icon action on click
    val icon: Painter? = null,
    val contentDescription: String?,
    val content: @Composable () -> Unit = {},
    val onClick: () -> Unit,
)