package com.example.uitoolkit_compose

import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import com.example.uitoolkit_compose.base.HgsTypography
import com.example.uitoolkit_compose.base.Theme
import com.example.uitoolkit_compose.texts.visibilityDetails
import com.example.uitoolkit_compose.topbars.HgsTopBars
import com.example.uitoolkit_compose.values.HgsColors
import java.util.*

@Composable
fun TitlesHomeContent (){
    val context = LocalContext.current
    val activity = (LocalLifecycleOwner.current as ComponentActivity)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        HgsTopBars.HgsPrimaryTopBar(title = "uitoolkit_Compose")
        Row( modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
        ) {
            Button(onClick = {
                context.startActivity(Intent(context,ButtonsComposeActivity::class.java))
                activity.finish()
            }, colors = ButtonDefaults.buttonColors(HgsColors.hgsToolkitMercury)){
                Text(color = HgsColors.hgsToolkitTundora, text = "buttons")
            }
            Button(onClick = {
                context.startActivity(Intent(context,NavigationsComposeActivity::class.java))
            },colors = ButtonDefaults.buttonColors(HgsColors.hgsToolkitMercury)){
                Text(color = HgsColors.hgsToolkitTundora, text = "navs")
            }
            Button(onClick = {
                context.startActivity(Intent(context,ActionsComposeActivity::class.java))
            },colors = ButtonDefaults.buttonColors(HgsColors.hgsToolkitMercury)){
                Text(color = HgsColors.hgsToolkitTundora, text = "acts")
            }
            Button(onClick = {
                context.startActivity(Intent(context,InputsComposeActivity::class.java))
            },colors = ButtonDefaults.buttonColors(HgsColors.hgsToolkitMercury)){
                Text(color = HgsColors.hgsToolkitTundora, text = "inputs")
            }
            Button(onClick = {
                context.startActivity(Intent(context,NetworkStatusComposeActivity::class.java))
            },colors = ButtonDefaults.buttonColors(HgsColors.hgsToolkitMercury)){
                Text(color = HgsColors.hgsToolkitTundora, text = "net")
            }
        }
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .weight(weight = 1f, fill = false)

        ) {
            //-------------------------------------------LARGE TITLE ---------------------------------------
            Text(modifier = Modifier.padding(1.dp), text = "Large title",
                style = HgsTypography.HgsUiToolkitTextAppearanceTitleLargeBold)
            Text(modifier = Modifier.padding(1.dp), text = "Large title",
                style = HgsTypography.HgsUiToolkitTextAppearanceTitleLargeBoldCongressBlue)
            Text(modifier = Modifier.padding(1.dp), text = "Large title",
                style = HgsTypography.HgsUiToolkitTextAppearanceTitleLargeBoldCerulean)
            Text(modifier = Modifier.padding(1.dp), text = "Large title",
                style = HgsTypography.HgsUiToolkitTextAppearanceTitleLarge)
            Text(modifier = Modifier.padding(1.dp), text = "Large title",
                style = HgsTypography.HgsUiToolkitTextAppearanceTitleLargeCongressBlue)
            Text(modifier = Modifier.padding(1.dp), text = "Large title",
                style = HgsTypography.HgsUiToolkitTextAppearanceTitleLargeCerulean)
            var visible=visibilityDetails()
            if(visible){
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    Text(text = "HgsUiToolkitTextAppearanceTitleLargeBold",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitleLargeBoldCongressBlue",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitleLargeBoldCerulean",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitleLarge",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitleLargeCongressBlue",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitleLargeCerulean",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }
            //-------------------------------------------TITLE 1 ----------------------------------------------------
            Text(text = "Title 1",style = HgsTypography.HgsUiToolkitTextAppearanceTitle1Bold)
            Text(text = "Title 1",style =HgsTypography.HgsUiToolkitTextAppearanceTitle1BoldCongressBlue)
            Text(text = "Title 1",style = HgsTypography.HgsUiToolkitTextAppearanceTitle1BoldCerulean)
            Text(text = "Title 1",style = HgsTypography.HgsUiToolkitTextAppearanceTitle1)
            Text(text = "Title 1",style = HgsTypography.HgsUiToolkitTextAppearanceTitle1CongressBlue)
            Text(text = "Title 1",style = HgsTypography.HgsUiToolkitTextAppearanceTitle1BoldCerulean)
            var visible1=visibilityDetails()
            if(visible1){
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    Text(text = "HgsUiToolkitTextAppearanceTitle1Bold",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle1BoldCongressBlue",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle1BoldCerulean",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle1",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle1CongressBlue",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle1BoldCerulean",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }
            //-------------------------------------------TITLE 2 ----------------------------------------------------
            Text(text = "Title 2",style = HgsTypography.HgsUiToolkitTextAppearanceTitle2Bold)
            Text(text = "Title 2",style =HgsTypography.HgsUiToolkitTextAppearanceTitle2BoldCongressBlue)
            Text(text = "Title 2",style = HgsTypography.HgsUiToolkitTextAppearanceTitle2BoldCerulean)
            Text(text = "Title 2",style = HgsTypography.HgsUiToolkitTextAppearanceTitle2)
            Text(text = "Title 2",style = HgsTypography.HgsUiToolkitTextAppearanceTitle2CongressBlue)
            Text(text = "Title 2",style = HgsTypography.HgsUiToolkitTextAppearanceTitle2BoldCerulean)
            var visible2=visibilityDetails()
            if(visible2){
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    Text(text = "HgsUiToolkitTextAppearanceTitle2Bold",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle2BoldCongressBlue",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle2BoldCerulean",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle2",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle2CongressBlue",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle2BoldCerulean",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }
            //-------------------------------------------TITLE 3 ----------------------------------------------------
            Text(text = "Title 3",style = HgsTypography.HgsUiToolkitTextAppearanceTitle3Bold)
            Text(text = "Title 3",style =HgsTypography.HgsUiToolkitTextAppearanceTitle3BoldCongressBlue)
            Text(text = "Title 3",style = HgsTypography.HgsUiToolkitTextAppearanceTitle3BoldCerulean)
            Text(text = "Title 3",style = HgsTypography.HgsUiToolkitTextAppearanceTitle3)
            Text(text = "Title 3",style = HgsTypography.HgsUiToolkitTextAppearanceTitle3CongressBlue)
            Text(text = "Title 3",style = HgsTypography.HgsUiToolkitTextAppearanceTitle3BoldCerulean)
            var visible3=visibilityDetails()
            if(visible3){
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    Text(text = "HgsUiToolkitTextAppearanceTitle3Bold",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle3BoldCongressBlue",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle3BoldCerulean",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle3",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle3CongressBlue",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceTitle3BoldCerulean",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }

            //-------------------------------------------BODY----------------------------------------------------
            Text(text = "Body",style = HgsTypography.HgsUiToolkitTextAppearanceBodyBold)
            Text(text = "Body",style = HgsTypography.HgsUiToolkitTextAppearanceBodyMedium)
            Text(text = "Body",style = HgsTypography.HgsUiToolkitTextAppearanceBodyLight)
            Text(text = "Body",style = HgsTypography.HgsUiToolkitTextAppearanceBody)

            var visible4=visibilityDetails()
            if(visible4){
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    Text(text = "HgsUiToolkitTextAppearanceBodyBold",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceBodyMedium",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceBodyLight",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceBody",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }
            //-------------------------------------------HEADLINE----------------------------------------------------
            Text(text = "Headline",style = HgsTypography.HgsUiToolkitTextAppearanceHeadlineBold)
            Text(text = "Headline",style = HgsTypography.HgsUiToolkitTextAppearanceHeadlineMedium)

            var visible5=visibilityDetails()
            if(visible5){
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    Text(text = "HgsUiToolkitTextAppearanceHeadlineBold",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceHeadlineMedium",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }
            //-------------------------------------------SUBHEADLINE----------------------------------------------------
            Text(text = "Subheadline",style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineBold)
            Text(text = "Subheadline",style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineMedium)
            Text(text = "Subheadline",style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadline)

            var visible6=visibilityDetails()
            if(visible6){
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    Text(text = "HgsUiToolkitTextAppearanceSubHeadlineBold",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceSubHeadlineMedium",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "HgsUiToolkitTextAppearanceSubHeadline",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }
//-------------------------------------------CAPTION----------------------------------------------------
            Text(text = "Caption",style = HgsTypography.HgsUiToolkitTextAppearanceCaptionBold)
            Text(text = "Caption",style = HgsTypography.HgsUiToolkitTextAppearanceCaptionMedium)
            Text(text = "Caption",style = HgsTypography.HgsUiToolkitTextAppearanceCaption)
            var visible7=visibilityDetails()
            if(visible7){
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .background(HgsColors.hgsToolkitCongressBlueSecondary)
                ) {
                    Text(text = "Theme_typography_caption_Bold",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "Theme_typography_captionMed",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                    Text(text = "Theme_typography_caption",textAlign = TextAlign.Center,
                        style = HgsTypography.HgsUiToolkitTextAppearanceSubHeadlineStyleRef)
                }
            }
        }
    }
}