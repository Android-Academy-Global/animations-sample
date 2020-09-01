package com.androidacademy.animationssample.animation

import androidx.compose.animation.animatedValue
import androidx.compose.animation.core.AnimationVector
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.TwoWayConverter
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
fun AnimatedValueView() {
    val expandedState = remember { mutableStateOf(false) }
    val viewHeight = animatedValue(
            initVal = 40f,
            converter = TwoWayConverter(
                    convertToVector = {
                        AnimationVector(it)
                    },
                    convertFromVector = {
                        it.value
                    }
            ),
            visibilityThreshold = Spring.DefaultDisplacementThreshold
    )

    Box(
            modifier = Modifier
                    .fillMaxWidth()
                    .preferredHeight(viewHeight.value.dp)
                    .clickable(onClick = {
                        expandedState.value = !expandedState.value
                        if (expandedState.value) {
                            viewHeight.animateTo(40f)
                        } else {
                            viewHeight.animateTo(140f)
                        }
                    }),
            backgroundColor = Color.Red
    )
}

@Preview
@Composable
fun AnimatedValuePreview() {
    AnimationsSampleTheme {
        AnimatedValueView()
    }
}
