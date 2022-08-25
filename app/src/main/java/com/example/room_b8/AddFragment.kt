package com.example.room_b8

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class AddFragment : Fragment() {

    private lateinit var database: StudentDatabase
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

//        database = Room.databaseBuilder(
//            requireActivity().applicationContext,
//            StudentDatabase::class.java, "studentDB"
//        ).build()
//
//        GlobalScope.launch {
//            database.studentDao().insertStudent(Student(0,"a",20))
//            database.studentDao().insertStudent(Student(1,"b",1))
//            database.studentDao().insertStudent(Student(2,"c",2))
//        }
//
////        database.studentDao().getAllStudent().observe(this,{
////            Log.d("ROOMDB","onCreate: $it")
////        })

        return inflater.inflate(R.layout.fragment_add, container, false)
    }

}