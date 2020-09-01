package com.androidacademy.animationssample.animation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.androidacademy.animationssample.ui.AnimationsSampleTheme

@Composable
fun AnimatedValuesView() {
    Column(
            modifier = Modifier.fillMaxSize().padding(32.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalGravity = Alignment.CenterHorizontally
    ) {
        AnimatedFloatView()
        AnimatedColorView()
    }
}

@Preview(showBackground = true)
@Composable
fun AnimatedValuesPreview() {
    AnimationsSampleTheme {
        AnimatedValuesView()
    }
}
