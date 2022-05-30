package com.example.uitoolkit_compose.texts

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.uitoolkit_compose.values.HgsColors

@Composable
fun visibilityDetails ():Boolean{
    var visible by remember { mutableStateOf(false) }
    Column( horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.padding(4 .dp))
        Button(modifier = Modifier.fillMaxWidth()
            .weight(4f),colors = ButtonDefaults.buttonColors(HgsColors.hgsToolkitText),
            onClick = { visible = !visible
            }) {
            Text(color = Color.White, text = "Details des styles")
        }
    }
    return visible
}