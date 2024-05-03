package com.example.dylan


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun SplashScreen(navController: NavController) {
    // State to track whether splash screen is finished
    val splashFinished = remember { mutableStateOf(false) }

    // LaunchedEffect to simulate a delay for splash screen
    LaunchedEffect(key1 = true) {
        // Simulate a delay of 2 seconds
        kotlinx.coroutines.delay(3000)
        // Set splashFinished to true after the delay
        splashFinished.value = true
    }

    // Observe changes in splashFinished and navigate accordingly
    LaunchedEffect(splashFinished.value) {
        if (splashFinished.value) {
            navController.navigate("login")
        }
    }

    // Main UI for the splash screen
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        // Show the splash screen content
        SplashContent()
    }
}
val brush = Brush.verticalGradient(
    colors = listOf(
        Color(0xff7BC9FF),
        Color(0xff8576FF)
    )
)
@Composable
fun SplashContent() {
    // Content of your splash screen

    Column(
        modifier = Modifier
            .background(brush = brush)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Computer Science", fontSize = 30.sp)
        // You can replace this image with your own splash screen image
        Image(
            painter = painterResource(id = R.drawable.splash_screen_image),
            contentDescription = "Splash Screen Image",
            modifier = Modifier
                .size(200.dp)
                .padding(16.dp),
            contentScale = ContentScale.Fit
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

        SplashScreen(navController = rememberNavController())

}