package com.example.taskupdate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.taskupdate.ui.theme.TaskUpdateTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskUpdateTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "welcome") {
                    composable("welcome") { WelcomeScreen(navController) }

                    composable("main") {
                        MainScreen(onAddTaskClick = {
                            navController.navigate("add")
                        })
                    }

                    composable("add") {
                        AddTaskScreen(navController)
                    }
                }
            }
        }
    }
}

@Composable
fun WelcomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to My To-Do App!",
            fontSize = 24.sp,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate("main")
        }) {
            Text("Continue->")
        }
    }
}

@Composable
fun MainScreen(onAddTaskClick: () -> Unit) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = onAddTaskClick) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add Task")
            }
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // This is where your task list will go in future
        }
    }

}
@Composable
fun AddTaskScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Add Task Screen", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.popBackStack() // Goes back to MainScreen
        }) {
            Text("Save Task")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewWelcomeScreen() {
    TaskUpdateTheme {
        // Cannot preview navigation screen directly
        WelcomeScreen(navController = rememberNavController())
    }
}
