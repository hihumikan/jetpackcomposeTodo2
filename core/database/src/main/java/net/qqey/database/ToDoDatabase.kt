package net.qqey.database

import androidx.room.Database
import androidx.room.RoomDatabase
import net.qqey.database.dao.TodoDao
import net.qqey.database.model.ToDoEntity

@Database(
    entities = [
        ToDoEntity::class,
    ],
    version = 1,
    exportSchema = true,
)
abstract class ToDoDatabase: RoomDatabase(){
    abstract fun toDoDao():TodoDao
}