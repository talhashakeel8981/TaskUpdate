package com.example.taskupdate

import android.text.Layout
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color



import kotlin.math.round


//========================
//Text(
//text = "Hello",
//fontSize = 26.sp,               // size of text
//color = Color.Red,              // color of text
//fontWeight = FontWeight.Bold,   // bold/normal/thin
//fontStyle = FontStyle.Italic,   // italic/normal
//textAlign = TextAlign.Center,   // left, right, center
//modifier = Modifier.padding(8.dp) // space around text
//)


//practise
//@Composable
//fun GreetingText() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(24.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = "Hello Greeting Message",
//            fontSize = 24.sp
//        )
//    }
//}
//@Preview(showBackground = true)
//@Composable
//fun PreviewGreetingText() {
//    GreetingText()
//}
//
//@Composable
//fun RowExample() {
//    Row(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(24.dp),
//        horizontalArrangement = Arrangement.SpaceBetween
//    ) {
//        Text(
//            text = "Left",
//            fontSize = 24.sp,
//            color = Color.Blue
//        )
//        Text(
//            text = "Right",
//            fontSize = 24.sp,
//            color = Color.Red
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewRowExample() {
//    RowExample()
//}