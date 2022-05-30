package com.example.uitoolkit_compose

import android.content.Intent
import android.inputmethodservice.Keyboard
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.uitoolkit_compose.base.*
import com.example.uitoolkit_compose.buttons.HgsButtons
import com.example.uitoolkit_compose.databinding.ActivityMainBinding
import com.example.uitoolkit_compose.topbars.HgsTopBars
import com.example.uitoolkit_compose.values.HgsColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        /*val binding= ActivityMainBinding.inflate(layoutInflater).apply {
            cbButtons.setOnClickListener {
                startActivity(Intent(this@MainActivity, ButtonsComposeActivity::class.java))
            }

            // define the action on navigation item click
            cbNavigations.setOnClickListener {
                startActivity(Intent(this@MainActivity, NavigationsComposeActivity::class.java))
            }

            // define the action on action item click
            cbActions.setOnClickListener {
                startActivity(Intent(this@MainActivity, ActionsComposeActivity::class.java))
            }

            // define the action on input item click
            cbInputs.setOnClickListener {
                startActivity(Intent(this@MainActivity, InputsComposeActivity::class.java))
            }

            // define the action on network item click
            cbNetwork.setOnClickListener {
                startActivity(Intent(this@MainActivity, NetworkStatusComposeActivity::class.java))
            }
        }*/
        //binding.composableListView.setContent {
        setContent {
            AppTheme {
                TitlesHomeContent()
            }
        }

        //setContentView(binding.root)
    }
}
@Composable
fun AppTheme(
    colors: AppColors = Theme.colors,
    typography: HgsTypography = HgsTypography,
    content: @Composable () -> Unit
) {
    val rememberedColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }
    CompositionLocalProvider(
        LocalColors provides rememberedColors,
        LocalTypography provides typography
    ) {
        content()
    }
}