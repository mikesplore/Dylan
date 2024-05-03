package com.example.dylan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Login(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(brush = brush),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {


        Column (modifier = Modifier
            .fillMaxWidth()
            .height(300.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            Text(text = "COMPUTER SCIENCE",
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black)
            Text(text = "Class Portal",
                fontFamily = FontFamily.SansSerif,
                fontSize = 20.sp,
                fontWeight = FontWeight.W400)

        }
        Column(modifier = Modifier
            .height(200.dp)
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround

        ) {
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Admission Number")},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xffA3FFD6),
                    unfocusedContainerColor = Color(0xffA3FFD6),

                ))
            TextField(
                value = "",
                onValueChange = {},
                label = { Text(text = "Admission Number")},
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xffA3FFD6),
                    unfocusedContainerColor = Color(0xffA3FFD6),

                    ))

        }

        Row {
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(50.dp)
                    .width(280.dp),
                shape = RoundedCornerShape(10.dp)
                    ) {
                Text(text = "Login")
                
            }
        }

    }
}

@Preview
@Composable
fun Loginpreview(){
    Login(navController = rememberNavController())

}