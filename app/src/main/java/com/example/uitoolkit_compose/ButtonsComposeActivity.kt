package com.example.uitoolkit_compose

import android.os.Bundle
import android.os.SystemClock.sleep
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.uitoolkit_compose.base.HgsTypography
import com.example.uitoolkit_compose.base.SampleRow
import com.example.uitoolkit_compose.base.SampleScaffold
import com.example.uitoolkit_compose.buttons.HgsButtons
import com.example.uitoolkit_compose.buttons.HgsCircularProgressInd
import com.example.uitoolkit_compose.buttons.HgsLoadingIndicator
import com.example.uitoolkit_compose.buttons.HgsProgressButton
import com.example.uitoolkit_compose.values.HgsColors
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import java.lang.Thread.sleep
import java.sql.Time

var topBarTitle:String ="Buttons"

class ButtonsComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ButtonSample()
        }
    }
}

@Composable
fun ButtonSample(){
    SampleScaffold(title = topBarTitle) {
        LazyColumn(modifier = Modifier.fillMaxSize()){
            item {
                SampleRow(fstItem = true) {
                    HgsButtons.HgsMainButton(text = "Main") {}
                    HgsButtons.HgsMainButton(text = "Main", enabled = false) {}
                }
                Row(horizontalArrangement = Arrangement.Center,modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp)
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    // to print the style used, similar to the function of the class code data created
                    // but, in compose, to be automatic, we can create this in a compose class
                    //after call this compose class dependent of one lazyColumn (list to print)
                    Text(text = "HgsButtons.HgsMainButton",
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }
            item {
                SampleRow(fstItem = true) {
                    HgsButtons.HgsGhostButton(text = "Ghost") {}
                    HgsButtons.HgsGhostButton(text = "Ghost", enabled = false) {}
                }
                Row(horizontalArrangement = Arrangement.Center,modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp)
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    Text(text = "HgsButtons.HgsGhostButton",
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }
            item {
                SampleRow(fstItem = true) {
                    HgsButtons.HgsRoundedButton(text = "", icon = painterResource(
                        id = R.drawable.img)) {}
                    HgsButtons.HgsRoundedButton(text = "", enabled = false, icon = painterResource(
                        id = R.drawable.img)) {}
                }
                Row(horizontalArrangement = Arrangement.Center,modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp)
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    Text(text = "HgsButtons.HgsRoundedButton",
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }
            item {
                var loading1 by remember {
                    mutableStateOf(false)
                }
                val text = MutableStateFlow("load")
                val myText by text.collectAsState()
                SampleRow() {
                    HgsButtons.HgsProgressButton(text = myText, onClick = {
                        loading1 = true
                        if(loading1) text.value="loading..." else text.value="load"
                        },
                        loading = loading1)
                    HgsButtons.HgsProgressButton(text = "load", enabled = false) {}
                }
                SampleRow() {
                    HgsButtons.HgsProgressButton(text = "load", icon = painterResource(
                        id = R.drawable.ic_connection), modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8 .dp, end = 8 .dp)
                        ) {}
                }
                Row(horizontalArrangement = Arrangement.Center,modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp)
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    Text(text = "HgsButtons.HgsProgressButton",
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }
            item {
                var loading2 by remember {
                    mutableStateOf(false)
                }
                val text = MutableStateFlow("load")
                val loadText by text.collectAsState()
                SampleRow() {
                    HgsButtons.HgsProgressGhostButton(text = loadText, onClick = {
                        loading2= true
                        if(loading2) text.value="loading..." else text.value="load"}, loading = loading2)
                    HgsButtons.HgsProgressGhostButton(text = "load", enabled = false) {}
                }
                SampleRow() {
                    HgsButtons.HgsProgressGhostButton(text = "load", icon = painterResource(
                        id = R.drawable.ic_connection), modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8 .dp, end = 8 .dp)
                    ) {}
                }
                Row(horizontalArrangement = Arrangement.Center,modifier = Modifier
                    .padding(top = 8.dp, bottom = 8.dp)
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    Text(text = "HgsButtons.HgsProgressGhostButton",
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }
        }
    }

}