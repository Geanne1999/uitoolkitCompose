package com.example.uitoolkit_compose.base

import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import com.example.uitoolkit_compose.MainActivity
import com.example.uitoolkit_compose.topbars.HgsTopBars

@Composable
fun SampleScaffold(
    title:String,
    modifier: Modifier=Modifier,
    content:@Composable (padding: PaddingValues) ->Unit
) {
    val context = LocalContext.current
    val activity = (LocalLifecycleOwner.current as ComponentActivity)
    Scaffold(
        topBar ={HgsTopBars.HgsPrimaryTopBar(title = title,
        navigationIcon = {HgsButtonPreviousPage(
            onClick = { context.startActivity(Intent(context, MainActivity::class.java))
                activity.finish()
                      },
            contentDescription = ""
        )})},
        modifier = modifier,
        content = {content(it)}
    )
}