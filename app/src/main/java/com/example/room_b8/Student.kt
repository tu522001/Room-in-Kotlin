package com.example.room_b8

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student")
data class Student(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val name : String,
    val age: Int
)
