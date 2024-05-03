package net.qqey.data.repository

import net.qqey.database.dao.TodoDao
import net.qqey.database.model.ToDoEntity
import net.qqey.model.ToDo
import java.util.Date
import javax.inject.Inject

class LocalToDoRepository @Inject constructor(
    private val todoDao: TodoDao,
)
: ToDoRepository {
    override suspend fun create(title: String, description: String): ToDo {
        val todo = ToDoEntity(
            id = 0,
            title = title,
            description = description,
            done = 0,
            createdAt = System.currentTimeMillis(),
            updatedAt = System.currentTimeMillis()
        )
        val id = todoDao.create(todo)
        return ToDo(
            id = id,
            title = title,
            description = description,
            isDone = false,
            createdAt = Date(todo.createdAt),
            updatedAt = Date(todo.updatedAt)
        )
    }
}