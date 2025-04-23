package com.example.taskupdate

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController, taskList: List<Task>) {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize()
    ) {
        Text(text = "Task Update App")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "• Create your tasks")
        Text(text = "• Add task due date")
        Text(text = "• Add task description")
        Text(text = "• Highlight overdue tasks automatically")

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate(route = "tasksscreen") }) {
            Text(text = "Go to Task Screen")
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text("Saved Tasks:")

        // Display titles of all tasks
        taskList.forEach { task ->
            Button(onClick = {
                // Navigate to TaskDetailScreen and pass the selected task
                navController.navigate("taskDetailScreen/${task.title}/${task.description}/${task.dueDate}")
            }) {
                Text(task.title)
            }
            Spacer(modifier = Modifier.height(12.dp))
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

@Composable
fun TasksScreen(navController: NavController, taskList: MutableList<Task>, addTask: (Task) -> Unit) {
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var dueDate by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize()
    ) {
        Text(text = "Task Form")

        // Task title input field
        TextField(
            value = title,
            onValueChange = { title = it },
            label = { Text("Task Title") }
        )
        Spacer(modifier = Modifier.height(8.dp))

        // Task description input field
        TextField(
            value = description,
            onValueChange = { description = it },
            label = { Text("Task Description") }
        )
        Spacer(modifier = Modifier.height(8.dp))

        // Task due date input field
        TextField(
            value = dueDate,
            onValueChange = { dueDate = it },
            label = { Text("Due Date") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Button to save the task
        Button(onClick = {
            if (title.isNotBlank() && description.isNotBlank() && dueDate.isNotBlank()) {
                val newTask = Task(title, description, dueDate)
                addTask(newTask) // Add the task to the main screen's list
                title = ""
                description = ""
                dueDate = ""
                navController.popBackStack() // Navigate back to MainScreen
            }
        }) {
            Text("Save Task")
        }
    }
}
@Composable
fun TaskDetailScreen(navController: NavController, task: Task) {
    Column(
        modifier = Modifier
            .padding(24.dp)
            .fillMaxSize()
    ) {
        Text(text = "Task Details", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(16.dp))

        Text("Title: ${task.title}", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Description: ${task.description}", style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(8.dp))
        Text("Due Date: ${task.dueDate}", style = MaterialTheme.typography.bodyLarge)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.popBackStack() }) {
            Text("Back to Task List")
        }
    }
}



