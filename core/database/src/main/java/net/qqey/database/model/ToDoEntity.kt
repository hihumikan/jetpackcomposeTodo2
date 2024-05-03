package net.qqey.database.model

import android.icu.text.CaseMap.Title
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "todo"
)
data class ToDoEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val title: String,
    val description: String,
    val done: Int,
    val createdAt: Long,
    val updatedAt: Long,
)
