package net.qqey.feature_todo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateTodoScreen(
    back: () -> Unit,
) {
    var title by rememberSaveable { mutableStateOf("") }
    var description by rememberSaveable { mutableStateOf("") }
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(stringResource(R.string.create_todo_title)) },
            navigationIcon = {
                IconButton(onClick = back) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                }
            },
        )
    }) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            OutlinedTextField(
                label = {
                    Text(stringResource(R.string.title))
                },
                value = title,
                onValueChange = { title = it },
                singleLine = true,
                modifier = Modifier
                    .padding(
                        horizontal = 16.dp,
                        vertical = 8.dp
                    )
                    .fillMaxWidth()
            )
            OutlinedTextField(
                label = {
                    Text(stringResource(R.string.description))
                },
                value = description,
                onValueChange = { description = it },
                modifier = Modifier
                    .padding(
                        horizontal = 16.dp,
                    )
                    .padding(bottom = 8.dp)
                    .fillMaxSize()
            )
        }
    }
}

@Preview
@Composable
private fun Preview() {
    CreateTodoScreen(back = {})
}