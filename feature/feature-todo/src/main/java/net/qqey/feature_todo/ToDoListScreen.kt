package net.qqey.feature_todo

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ToDoListScreen(
    toCreateScreen: () -> Unit,
) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = toCreateScreen) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = null)
            }
        }
    )
    { paddingValues ->
        Text("ToDoListScreen",
            modifier = Modifier.padding(paddingValues),
        )
    }
}

@Preview
@Composable
private fun Preview() {
    ToDoListScreen (
        toCreateScreen = {}
    )
}