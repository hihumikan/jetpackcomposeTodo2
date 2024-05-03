package net.qqey.database.dao

import androidx.room.Dao
import androidx.room.Insert
import net.qqey.database.model.ToDoEntity

@Dao
interface TodoDao {
    @Insert
    suspend fun create(todo: ToDoEntity): Long
}