package com.example.encapsulationtesting

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun main() {
        // Bank Account Test
        val bankAccount = BankAccount(1000.0)

        // If incase the deposite balance is less than 0 it will through an illegal Argument exception
        val depositBalance = 3000.0
        bankAccount.deposit(depositBalance)

        // If incase the withdraw balance is greater  than balance it will through an illegal Argument exception
        val withDrawBalance = 500.0
        bankAccount.withDraw(withDrawBalance)


        // Car Test

        val car = Car("Kie", "Forte", 41)

        car.get()


        val carMake = "Subaru Car"
        val carModel = "Impreza"
        val carMilage = 54

        // If incase the carMilage is less than 0 it will throw an Illegal Argument Exception
        car.set(carMake, carModel, carMilage)


        // Employee Test

        val employee = Employee("Zaman", "HR", 2000)

        employee.get()

        val employeeName = "Ashfaq"
        val employeePosition = "Android Developer"
        val employeeSalary = 50000

        employee.set(employeeName, employeePosition, employeeSalary)


        // Product Test
        val product = Product("Cold Drink", 300.0)

        product.get()

        val productName = "Biscuit"
        val productPrice = 20.0
        product.set(productName, productPrice)


        // Student Test

        val student = Student("Jawad","A")

        student.gets()

        val stdName = "Usman"
        val stdGrade = "C"

        student.set(stdName,stdGrade)

    }
}