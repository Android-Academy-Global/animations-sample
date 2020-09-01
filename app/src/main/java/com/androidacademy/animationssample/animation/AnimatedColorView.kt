package com.androidacademy.animationssample.animation

import androidx.compose.animation.animatedColor
import androidx.compose.foundation.Box
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.androidacademy.animationssample.ui.AnimationsSampleTheme

@Composable
fun AnimatedColorView() {
    val expandedState = remember { mutableStateOf(false) }
    val viewColor = animatedColor(Color.Green)

    Box(
            modifier = Modifier
                    .fillMaxWidth()
                    .preferredHeight(40.dp)
                    .clickable(onClick = {
                        expandedState.value = !expandedState.value
                        if (expandedState.value) {
                            viewColor.animateTo(Color.Yellow)
                        } else {
                            viewColor.animateTo(Color.Green)
                        }
                    }),
            backgroundColor = viewColor.value
    )
}

@Preview
@Composable
fun AnimatedColorPreview() {
    AnimationsSampleTheme {
        AnimatedColorView()
    }
}
