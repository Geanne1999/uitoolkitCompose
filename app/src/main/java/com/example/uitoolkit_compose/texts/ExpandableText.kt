package com.example.uitoolkit_compose.texts

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.unit.sp

const val MINIMIZED=2

@Composable
fun ExpandableText(
    modifier: Modifier=Modifier,
    textStyle:String
){
    var isExpanded by remember{mutableStateOf(false)}
    val textLayoutResultState= remember {
        mutableStateOf<TextLayoutResult?>(null)
    }
    var isClickable by remember{mutableStateOf(false)}
    var finalTextDetails by remember{mutableStateOf(textStyle)}

    val textLayoutResult =textLayoutResultState.value
    
    LaunchedEffect(textLayoutResult){
        if(textLayoutResult==null){
            return@LaunchedEffect
        }
        when{
            isExpanded->{
                finalTextDetails="$textStyle Show less"
            }
            //if not expanded
            !isExpanded && textLayoutResult.hasVisualOverflow->{
                val lastCharIndex=textLayoutResult.getLineEnd(MINIMIZED-1)
                val showMoreString="Show More..."
                val adjustedText=textStyle
                    .substring(startIndex = 0, endIndex = lastCharIndex)
                    .dropLast(showMoreString.length)
                    .dropLastWhile {
                        it==' ' || it=='.'
                    }
                finalTextDetails="$adjustedText$showMoreString"
                isClickable=true
            }
        }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(
            text = finalTextDetails,
            onTextLayout = {
                textLayoutResultState.value=it
        },
        modifier = modifier
            .clickable (enabled = isClickable){
                isExpanded=!isExpanded
            }
            .animateContentSize(),
            fontSize = 20 .sp
            )
    }
}