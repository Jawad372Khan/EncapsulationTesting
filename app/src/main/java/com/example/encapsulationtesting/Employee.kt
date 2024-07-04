package com.example.encapsulationtesting



class Employee(private var name : String,private var position : String,private var salary : Int ) {
    fun get()
    {
        if (salary > 0){
            println("Employee Name: $name, Employee Position: $position, Employee Salary : $salary")
        }
        else
        {
            throw IllegalArgumentException("Invalid Salary Amount")
        }

    }
    fun set(empName : String, empPosition : String, empSalary : Int)
    {
        name = empName
        position = empPosition
        if(empSalary > 0)
        {
            salary = empSalary
            println("Employee Name: $name, Employee Position: $position, Employee Salary : $salary")
        }
        else
        {
            throw IllegalArgumentException("Invalid Salary Amount")
        }
    }


}