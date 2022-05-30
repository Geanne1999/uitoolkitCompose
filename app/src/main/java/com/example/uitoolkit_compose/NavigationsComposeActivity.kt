package com.example.uitoolkit_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.uitoolkit_compose.base.HgsTypography
import com.example.uitoolkit_compose.base.SampleScaffold
import com.example.uitoolkit_compose.navigations.HgsNavigations
import com.example.uitoolkit_compose.navigations.NavigationGraph
import com.example.uitoolkit_compose.values.HgsColors

private var topBarTitle:String ="Navigations"
class NavigationsComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            SampleScaffold(title = topBarTitle) {
                LazyColumn(modifier = Modifier.fillMaxSize()){
                    item {
                        val navController= rememberNavController()
                        //calling the content
                        HgsNavigations.HgsBottomNavigation(navController = navController)
                        //putting the way to the button selection
                        NavigationGraph(navController = navController)
                        Row(horizontalArrangement = Arrangement.Center,modifier = Modifier
                            .padding(top = 8.dp, bottom = 8.dp)
                            .fillMaxWidth()
                            .background(HgsColors.hgsToolkitCongressBlueSecondary)
                        ) {
                            Text(text = "HgsNavigation.HgsBottomNavigation",
                                style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                        }
                    }
                }
            }
        }
    }
}