package com.example.taskupdate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.mutableStateListOf
import androidx.navigation.NavType
import androidx.navigation.navArgument


//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            MyScaffoldScreen()
//        }
//    }
//}


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            RecompositionExample()
            ShowToastOnLaunch()
        }
    }
}
//            val navController = rememberNavController()
//
//            // Initialize task list and addTask function
//            val taskList = remember { mutableStateListOf<Task>() }
//
//            // Function to add task to the taskList
//            val addTask: (Task) -> Unit = { task ->
//                taskList.add(task)
//            }
//
//            NavHost(navController = navController, startDestination = "mainScreen") {
//                composable("mainScreen") {
//                    MainScreen(navController = navController, taskList = taskList)
//                }
//
//                composable("tasksscreen") {
//                    TasksScreen(
//                        navController = navController,
//                        taskList = taskList,
//                        addTask = addTask
//                    )
//                }
//
//                // New route for TaskDetailScreen, receiving title, description, and due date as arguments
//                composable(
//                    "taskDetailScreen/{title}/{description}/{dueDate}",
//                    arguments = listOf(
//                        navArgument("title") { type = NavType.StringType },
//                        navArgument("description") { type = NavType.StringType },
//                        navArgument("dueDate") { type = NavType.StringType }
//                    )
//                ) { backStackEntry ->
//                    val title = backStackEntry.arguments?.getString("title") ?: ""
//                    val description = backStackEntry.arguments?.getString("description") ?: ""
//                    val dueDate = backStackEntry.arguments?.getString("dueDate") ?: ""
//
//                    TaskDetailScreen(navController = navController, task = Task(title, description, dueDate))
//                }
//            }
//        }
//    }
//}


//        setContent {
//            // Using NavHost to handle navigation
//            val navController = rememberNavController()
//
//            NavHost(navController = navController, startDestination = "home") {
//                composable("home") {
//                    HomeScreen(navController) // Pass navController to HomeScreen
//                }
//                composable("greeting") {
//                    GreetingScreen() // No need for navController in GreetingScreen
//                }
//            }
//        }
//    }
//}

//@Composable
//fun WelcomeScreen(navController: NavController) {
//    var userName by remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = "Welcome to Task Update!",
//            fontSize = 24.sp,
//            color = MaterialTheme.colorScheme.primary
//        )
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        TextField(
//            value = userName,
//            onValueChange = { userName = it },
//            placeholder = { Text("Enter your name") },
//            keyboardOptions = KeyboardOptions(
//                capitalization = KeyboardCapitalization.Words
//            )
//        )
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(onClick = {
//            navController.navigate("main")
//        }) {
//            Text("Continue →")
//        }
//    }
//}
//
//@Composable
//fun MainScreen(
//    tasks: List<String>,
//    onAddTaskClick: () -> Unit
//) {
//    Scaffold(
//        floatingActionButton = {
//            FloatingActionButton(onClick = onAddTaskClick) {
//                Icon(imageVector = Icons.Default.Add, contentDescription = "Add Task")
//            }
//        }
//    ) { paddingValues ->
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(paddingValues)
//                .padding(16.dp)
//        ) {
//            Text("Your Tasks:", fontSize = 20.sp)
//
//            Spacer(modifier = Modifier.height(8.dp))
//
//            for (task in tasks) {
//                Text("- $task", fontSize = 16.sp)
//            }
//        }
//    }
//}
//
//@Composable
//fun AddTaskScreen(
//    navController: NavController,
//    onTaskSaved: (String) -> Unit
//) {
//    var taskTitle by remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(text = "Add Task Screen", fontSize = 24.sp)
//        Spacer(modifier = Modifier.height(20.dp))
//
//        AddTaskField(text = taskTitle, onTextChange = { taskTitle = it })
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(onClick = {
//            if (taskTitle.isNotBlank()) {
//                onTaskSaved(taskTitle) // save to shared list
//                navController.popBackStack() // go back
//            }
//        }) {
//            Text("Save Task")
//        }
//    }
//}
//
//@Composable
//fun ShowTextInput() {
//    var text by remember { mutableStateOf("") }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        TextField(
//            value = text,
//            onValueChange = { text = it },
//            label = { Text("Enter something") },
//            keyboardOptions = KeyboardOptions(
//                capitalization = KeyboardCapitalization.Sentences
//            )
//        )
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Text(text = "You typed: $text", fontSize = 18.sp)
//    }
//}
//
//@Composable
//fun AddTaskField(text: String, onTextChange: (String) -> Unit) {
//    TextField(
//        value = text,
//        onValueChange = onTextChange,
//        placeholder = { Text("Enter Your Task Title Here...") },
//        keyboardOptions = KeyboardOptions(
//            capitalization = KeyboardCapitalization.Sentences
//        )
//    )
//}