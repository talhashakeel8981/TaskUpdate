package com.example.taskupdate

import android.text.Layout
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text


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



@Composable fun Textfieldlearning()
{
    TextField(
        value = "Hello",
        onValueChange = {},
    label = { Text("Your name") }
    )


}

//@Preview (showBackground = true)
//@Composable fun PreviewTextfieldlearning()
//{
//    Textfieldlearning()
//}


@Composable
fun TextFieldWithMutableState() {
   var name by remember { mutableStateOf("") }
    TextField(
        value = name,
        onValueChange = {name=it},
        label = { Text("testing") }
    )
}
//
//@Preview (showBackground = true)
//@Composable fun PreviewTextfield()
//{
//    TextFieldWithMutableState()
//}
@Composable fun UserInput()
{
 var username by remember{ mutableStateOf("") }
    var message by remember{ mutableStateOf("") }
    Column(
            modifier=Modifier
                .padding(24.dp)
                .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
            )
    {
TextField(
    value = username,
    onValueChange = {username=it},
    label = {Text("enter your name")}
)
        Button(onClick = {
            message = if (username.isNotBlank()) {
                "Hello $username"
            } else {
                "please enter your name"
            }
        }
            )
            {
                if (message.isNotEmpty()) {
                    Text(text = message)
                }

        }
    }
}
//@Preview (showBackground = true)
//@Composable fun PreviewUserInput()
//{
//    UserInput()
//}


//-----------------------------------------------
//🔐 Question: Build a Simple Login Form UI in Jetpack Compose
//Requirements:
//
//There should be two TextFields:
//
//One for Username
//
//One for Password (the input should be hidden like a real password field)
//
//There should be a Login button. On clicking the button:
//
//If both fields are not empty, display:
//"Welcome <username>"
//
//If either field is empty, display:
//"Please enter username and password"
//
//Below the button, display the message as a Text.
//



@Composable fun LoginForm(
    onclick: () -> Unit = {}
)
{
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column (
        modifier = Modifier
            .padding(10.dp)

            .fillMaxSize(),

//      verticalArrangement = Arrangemen

    )

    {
        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("username") }
        )
        Spacer(
            modifier = Modifier
                .height(16.dp)
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
        )
        TextField(
            onValueChange = { password = it },
            value = password,
            label = { Text("Password") }
        )
        Spacer(
            modifier = Modifier
                .height(16.dp)
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
        )
        Button(
            onClick = {
                println("Login clicked with username: $username and password: $password")
            }
        ) {
            Text(text = "Login")
        }


    }
}
@Preview (showBackground = true)
@Composable fun PreviewLoginForm()
{
    LoginForm()
}
