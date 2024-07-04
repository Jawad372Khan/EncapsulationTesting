package com.example.encapsulationtesting

class BankAccount (private var balance : Double) {

    fun  deposit(amount : Double)
    {
        if(amount > 0.0)
        {
            balance += amount
            println(balance)
        }
        else
        {
            throw IllegalArgumentException("Invalid Amount")
        }
    }
    fun withDraw(amount: Double)
    {
        if(balance > amount)
        {
            balance -= amount
            println(balance)
        }
        else
        {
            throw IllegalArgumentException("Invalid Amount")
        }
    }

}