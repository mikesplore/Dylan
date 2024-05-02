package com.example.dylan

import androidx.compose.animation.core.VisibilityThreshold
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Start(){
    val brush = Brush.verticalGradient(
        colors = listOf(
            Color(0xff10439F),
            Color(0xff874CCC),
            Color(0xffC65BCF),
            Color(0xffF27BBD)
        )
    )
    Column(modifier = Modifier
        .fillMaxSize()
        .background(brush = brush),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Column (modifier = Modifier
            .height(200.dp)
            .width(300.dp)
            .background(color = Color.Transparent, shape = AbsoluteRoundedCornerShape(20.dp))
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(30.dp),
                ambientColor = DefaultShadowColor,
                spotColor = Color.Black
            ),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Bachelors of Science")
            Text(text = "IN")

            Text(text = "COMPUTER SCIENCE",
                style = TextStyle(
                    fontSize = 25.sp,
                    fontStyle = FontStyle.Normal,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    shadow = Shadow(
                        color = Color.Gray,
                        offset = Offset(0.9f,0.7f),
                    )
                )

            )

        }

    }
}

@Preview
@Composable
fun Mcomposable(){
    Start()
}