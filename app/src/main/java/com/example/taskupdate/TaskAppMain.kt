package com.example.taskupdate

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable fun MainScreen(navController: NavController)
{
Column (
    modifier = Modifier
        .padding(24.dp)
        .fillMaxSize()
){
    Text(text = "Welcome To Task Update App")
    Spacer(modifier = Modifier.height(16.dp))
    Text(text = "• Create your tasks")
    Text(text = "• Add task due date")
    Text(text = "• Add task description")
    Text(text = "• Highlight overdue tasks automatically")

    Spacer(modifier = Modifier.height(16.dp))
    Button(onClick = {navController.navigate(route = "login")}) {
        Text(text = "Login Screen")
    }
}
}

@Composable fun Login_Screen(navController: NavController)
{
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize(),

    ) {
        Text(text = "Login Form")

        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = username,
            onValueChange = {username=it},
            label={ Text("Username") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = password,
            onValueChange = {password=it},
            label={ Text("Password") }
        )
        Button(onClick = {navController.navigate(route = "tasksscreen")}) {
            Text(text = "Login")
        }
    }
}

@Composable fun TasksScreen(navController: NavController)
{
    Column (
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize()
    ){
        Text(text = "Tasks Screen")


    }
}
