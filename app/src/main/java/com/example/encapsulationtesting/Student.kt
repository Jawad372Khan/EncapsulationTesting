package com.example.encapsulationtesting

class Student (private var name : String, private var grade: String) {
    companion object {
        private val validGrades = setOf("A", "B", "C", "D", "F")
    }

    fun set(stdName: String,stdGrade: String)
    {
        name = stdName
        if (stdGrade in validGrades )
        {
            grade = stdGrade
            println("Name : $name, Grade : $grade ")
        }
        else
        {
            println("Invalid Grade")
        }
    }

    fun gets()

    {
        if (grade in validGrades )
        {
            println("Name : $name, Grade : $grade ")
        }

        else
        {
            println("Invalid Grade")
        }
    }


}