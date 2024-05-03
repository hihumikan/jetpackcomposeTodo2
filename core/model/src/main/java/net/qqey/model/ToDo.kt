package net.qqey.model

import java.util.Date

data class ToDo(
    val id: Long,
    val title: String,
    val description: String,
    val isDone: Boolean,
    val createdAt: Date,
    val updatedAt: Date,
)
