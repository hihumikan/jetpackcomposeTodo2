package net.qqey.data.repository

import net.qqey.model.ToDo

interface ToDoRepository {
    suspend fun create(title: String, description: String): ToDo
}