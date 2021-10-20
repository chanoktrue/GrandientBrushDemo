package com.trueddns.homenano.grandientbrushdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()
        }
    }
}

@Composable
fun Home() {

    val sweepGradientBrush = Brush.sweepGradient(
        colors = listOf(Color.Red, Color.Green, Color.Yellow)
    )

    val verticalGradientBrush = Brush.verticalGradient(
        colors = listOf(Color.Red, Color.Green, Color.Yellow)
    )

    val linearGradientBrush = Brush.linearGradient(
        colors = listOf(Color.Red, Color.Green, Color.Yellow)
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        
        Text(text = "Sweep Gradient Brush")

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.33f)
                .padding(20.dp)
                .clip(
                    RoundedCornerShape(25.dp)
                )
                .background(
                    sweepGradientBrush
                )
        )
        
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Vertical Grandient Brush")
        
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.33f)
                .padding(20.dp)
                .clip(RoundedCornerShape(25.dp))
                .background(
                    verticalGradientBrush
                )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Linear Gradient Brush")

        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(0.33f)
                .padding(20.dp)
                .clip(RoundedCornerShape(25.dp))
                .background(
                    linearGradientBrush
                )
        )
    }

}

@Composable
@Preview
fun HomePreview() {
    Home()
}