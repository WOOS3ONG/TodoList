package com.example.todolist.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
// Room DB 활용을 위한 엔티티 구성
data class TodoEntity (
    @PrimaryKey(autoGenerate = true) var id : Int? = null,
    @ColumnInfo(name = "title") var title : String,
    @ColumnInfo(name = "importance") var importance : Int
)