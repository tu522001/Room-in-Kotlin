package com.example.room_b8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var database: StudentDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = Room.databaseBuilder(
            applicationContext,
            StudentDatabase::class.java, "studentDB"
        ).build()

        GlobalScope.launch {
            database.studentDao().insertStudent(Student(0,"a",20))
        }

        database.studentDao().getAllStudent().observe(this,{
            Log.d("ROOMDB","onCreate: $it")
        })
    }
}