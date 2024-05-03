package com.example.dylan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                    Main()
                }
            }
        }


@Composable
fun Main(){
    val navController = rememberNavController()
NavHost(navController = navController, startDestination ="splash" ) {
         composable("splash"){ SplashScreen(navController = navController)}
         composable("login"){ Login(navController = navController)}
    }
}

@Preview
@Composable
fun mainpreview(){
    Main()

}