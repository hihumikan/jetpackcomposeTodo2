package net.qqey.todo2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.qqey.feature_todo.CreateTodoScreen
import net.qqey.feature_todo.ToDoListScreen

@Composable
fun MainApp() {
    val  navController = rememberNavController()
    NavHost(navController = navController, startDestination = "/") {
        composable("/") {
            ToDoListScreen(
                toCreateScreen = {
                    navController.navigate("/create")
                }
            )
        }
        composable("/create"){
            CreateTodoScreen(
                back = {
                    navController.popBackStack()
                }
            )
        }
    }
}