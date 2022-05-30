package com.example.uitoolkit_compose.base


import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.uitoolkit_compose.R
import com.example.uitoolkit_compose.values.HgsColors

private val roboto = FontFamily(
    Font(R.font.roboto_regular, FontWeight.Normal)
)
private val robotoMedium = FontFamily(
    Font(R.font.roboto_medium, FontWeight.Medium)
)
private val robotoBold= FontFamily(
    Font(R.font.roboto_bold, FontWeight.Bold)
)
private val robotoLight = FontFamily(
    Font(R.font.roboto_light, FontWeight.Light)
)

object HgsTypography
{

    val HgsUiToolkitTextAppearanceTitleLargeBold: TextStyle = TextStyle(
        color = HgsColors.hgsToolkitTundora,
        fontFamily = robotoBold,
        lineHeight = 40 .sp,
        fontSize = 36.sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitleLargeBoldCongressBlue: TextStyle = TextStyle(
        color = HgsColors.hgsToolkitCongressBlueSecondary,
        fontFamily = robotoBold,
        lineHeight = 40 .sp,
        fontSize = 36.sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitleLargeBoldCerulean: TextStyle = TextStyle(
        color = HgsColors.hgsToolkitCeruleanSecondary,
        fontFamily = robotoBold,
        lineHeight = 40 .sp,
        fontSize = 36.sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitleLarge: TextStyle = TextStyle(
        color = HgsColors.hgsToolkitTundora,
        fontFamily = roboto,
        lineHeight = 40 .sp,
        fontSize = 36.sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitleLargeCongressBlue: TextStyle = TextStyle(
        color = HgsColors.hgsToolkitCongressBlueSecondary,
        fontFamily = roboto,
        lineHeight = 40 .sp,
        fontSize = 36.sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitleLargeCerulean: TextStyle = TextStyle(
        color = HgsColors.hgsToolkitCeruleanSecondary,
        fontFamily = roboto,
        lineHeight = 40 .sp,
        fontSize = 36.sp,
        letterSpacing = (-0.002).sp
    )

    val HgsUiToolkitTextAppearanceTitle1Bold: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoBold,
        lineHeight = 32.sp,
        fontSize = 28 .sp,
        letterSpacing = (-0.002).sp,
    )
    val HgsUiToolkitTextAppearanceTitle1BoldCongressBlue: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitCongressBlueSecondary,
        fontFamily = robotoBold,
        lineHeight = 32.sp,
        fontSize = 28 .sp,
        letterSpacing = (-0.002).sp,
    )
    val HgsUiToolkitTextAppearanceTitle1BoldCerulean: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitCeruleanSecondary,
        fontFamily = robotoBold,
        lineHeight = 32.sp,
        fontSize = 28 .sp,
        letterSpacing = (-0.002).sp,
    )
    val HgsUiToolkitTextAppearanceTitle1: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = roboto,
        lineHeight = 32.sp,
        fontSize = 28 .sp,
        letterSpacing = (-0.002).sp,
    )
    val HgsUiToolkitTextAppearanceTitle1CongressBlue: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitCongressBlueSecondary,
        fontFamily = roboto,
        lineHeight = 32.sp,
        fontSize = 28 .sp,
        letterSpacing = (-0.002).sp,
    )
    val HgsUiToolkitTextAppearanceTitle1Cerulean: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitCeruleanSecondary,
        fontFamily = roboto,
        lineHeight = 32.sp,
        fontSize = 28 .sp,
        letterSpacing = (-0.002).sp,
    )

    val HgsUiToolkitTextAppearanceTitle2Bold: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoBold,
        lineHeight = 28.sp,
        fontSize = 24 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitle2BoldCongressBlue: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitCongressBlueSecondary,
        fontFamily = robotoBold,
        lineHeight = 28.sp,
        fontSize = 24 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitle2BoldCerulean: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitCeruleanSecondary,
        fontFamily = robotoBold,
        lineHeight = 28.sp,
        fontSize = 24 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitle2: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = roboto,
        lineHeight = 28.sp,
        fontSize = 24 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitle2CongressBlue: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitCongressBlueSecondary,
        fontFamily = roboto,
        lineHeight = 28.sp,
        fontSize = 24 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitle2Cerulean: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitCeruleanSecondary,
        fontFamily = roboto,
        lineHeight = 28.sp,
        fontSize = 24 .sp,
        letterSpacing = (-0.002).sp
    )

    val HgsUiToolkitTextAppearanceTitle3Bold = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoBold,
        lineHeight = 24.sp,
        fontSize = 20 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitle3BoldCongressBlue = TextStyle(
        color=HgsColors.hgsToolkitCongressBlueSecondary,
        fontFamily = robotoBold,
        lineHeight = 24.sp,
        fontSize = 20 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitle3BoldCerulean = TextStyle(
        color=HgsColors.hgsToolkitCeruleanSecondary,
        fontFamily = robotoBold,
        lineHeight = 24.sp,
        fontSize = 20 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitle3 = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoBold,
        lineHeight = 24.sp,
        fontSize = 20 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitle3CongressBlue = TextStyle(
        color=HgsColors.hgsToolkitCongressBlueSecondary,
        fontFamily = robotoBold,
        lineHeight = 24.sp,
        fontSize = 20 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceTitle3Cerulean = TextStyle(
        color=HgsColors.hgsToolkitCeruleanSecondary,
        fontFamily = robotoBold,
        lineHeight = 24.sp,
        fontSize = 20 .sp,
        letterSpacing = (-0.002).sp
    )

    val HgsUiToolkitTextAppearanceBody = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = roboto,
        lineHeight = 20.sp,
        fontSize = 16 .sp,
        letterSpacing = (-0.002).sp
    )

    val HgsUiToolkitTextAppearanceBodyMedium = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoMedium,
        lineHeight = 20.sp,
        fontSize = 16 .sp,
        letterSpacing = (-0.002).sp
    )

    val HgsUiToolkitTextAppearanceBodyLight: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoLight,
        lineHeight = 20.sp,
        fontSize = 16 .sp,
        letterSpacing = (-0.002).sp
    )

    val HgsUiToolkitTextAppearanceBodyBold: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoBold,
        lineHeight = 20.sp,
        fontSize = 16 .sp,
        letterSpacing = (-0.002).sp
    )

    val HgsUiToolkitTextAppearanceHeadlineBold: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoBold,
        lineHeight = 20.sp,
        fontSize = 16 .sp,
        letterSpacing = (-0.002).sp
    )

    val HgsUiToolkitTextAppearanceHeadlineMedium: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoMedium,
        lineHeight = 20.sp,
        fontSize = 16 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceHeadlineBoldButton: TextStyle = TextStyle(
        fontFamily = robotoBold,
        lineHeight = 20.sp,
        fontSize = 16 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceHeadlineBoldButtonGhost: TextStyle = TextStyle(
        fontFamily = robotoBold,
        lineHeight = 20.sp,
        fontSize = 16 .sp,
        letterSpacing = (-0.002).sp
    )

    val HgsUiToolkitTextAppearanceSubHeadlineBold: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoBold,
        lineHeight = 18.sp,
        fontSize = 14 .sp,
        letterSpacing = (-0.002).sp
    )

    val HgsUiToolkitTextAppearanceSubHeadlineMedium: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoMedium,
        lineHeight = 18.sp,
        fontSize = 14 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceSubHeadline: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = roboto,
        lineHeight = 18.sp,
        fontSize = 14 .sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceSubHeadlineStyleRef: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitWhite,
        fontFamily = roboto,
        lineHeight = 18.sp,
        fontSize = 14 .sp,
        letterSpacing = (-0.002).sp
    )

    val HgsUiToolkitTextAppearanceCaptionBold: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoBold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = (-0.002).sp
    )

    val HgsUiToolkitTextAppearanceCaptionMedium: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = robotoMedium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = (-0.002).sp
    )
    val HgsUiToolkitTextAppearanceCaption: TextStyle = TextStyle(
        color=HgsColors.hgsToolkitTundora,
        fontFamily = roboto,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = (-0.002).sp
    )
}

internal val LocalTypography = staticCompositionLocalOf {HgsTypography}