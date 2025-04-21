package com.example.taskupdate

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlin.math.round

//👉 Screen 1: Welcome Screen
//A Text: "Welcome to the App!"
//
//A Button: When clicked, it navigates to the Login screen
//
//👉 Screen 2: Login Screen
//Just a Text: "This is the Login Screen"


@Composable
fun WelcomeScreen(navControllers: NavController) {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize()
    ) {
        Text(text = "Welcome to the App!")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navControllers.navigate("login")
        }) {
            Text("Go to Login")
        }
    }
}
@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize()
    ) {
        Text(text = "This is the Login Screen Sir")
    }
}

//Task: Simple Navigation Between Two Screens
//You are going to create two screens:
//
//Home Screen: A welcome screen with a button to go to the Greeting Screen.
//
//Greeting Screen: A screen that shows a greeting message.
//
//Steps to Complete:
//Step 1: Set Up MainActivity with NavHost
//In MainActivity, you need to use NavController to manage navigation between screens. This will handle navigating from Home Screen to Greeting Screen.
//
//Set up the NavController and define the NavHost with two destinations:
//
//"home": For the Home screen.
//
//"greeting": For the Greeting screen.
//
//Step 2: Create HomeScreen Composable
//This is the first screen where you will have:
//
//A Text to welcome the user (for example: "Welcome to the App!").
//
//A Button that navigates to the Greeting Screen when clicked.
//
//Step 3: Create GreetingScreen Composable
//This screen will show a simple Text (e.g., "Hello!"), which is displayed when navigating from the Home screen.


//@Composable
//fun HomeScreen(navController: NavController) {
//    Column(
//        modifier = Modifier
//            .padding(24.dp)
//            .fillMaxSize()
//    ) {
//        Text(
//            text = "Welcome to the App!"
//        )
//        Button(onClick = {
//            // Navigate to GreetingScreen
//            navController.navigate("greeting") // Changed to match route
//        }) {
//            Text(
//                text = "Go to Greeting Screen"
//            )
//        }
//    }
//}
//
//@Composable
//fun GreetingScreen() {
//    Column(
//        modifier = Modifier
//            .padding(24.dp)
//            .fillMaxSize()
//    ) {
//        Text(
//            text = "Hello, Welcome to the Greeting Screen!"
//        )
//    }
//}


//Screen 1: Welcome Screen
//A Text: "Welcome to MyApp!"
//
//A Button: On click, navigate to Screen 2 (Login Screen)
//
//🔹 Screen 2: Login Screen
//A TextField: For entering a username
//
//A Button: On click, navigate to Screen 3 (Dashboard Screen) only if the text field is not empty
//
//If text field is empty, show a Text: "Please enter a username"
//
//🔹 Screen 3: Dashboard Screen
//A Text: "Hello, [username]!"
//
//📌 Instructions
//Use NavHost and NavController to navigate between screens.
//
//Pass the username from Screen 2 to Screen 3 using route arguments.
//
//You can use simple string route like "dashboard/$username" and extract the username in Screen 3.


//@Composable fun MainScreens(navControllers: NavController)
//{
//    Column (
//        modifier = Modifier
//            .padding(24.dp)
//            .fillMaxSize()
//    ){
//        Text(
//            text = "Welcome To Task Update App",
//            fontSize = 35.sp,
//
//
//        )
//        Button(onClick = {
//            navControllers.navigate("logins")
//        }) {
//            Text(
//                text = "Login Screen"
//            )
//        }
//
//    }
//}
//
//@Composable fun Login_Screen()
//{
//    Column (
//        modifier = Modifier
//            .padding(24.dp)
//            .fillMaxSize()
//    ){
//        Text(
//            text = "hello"
//        )
//    }
//}