package com.example.encapsulationtesting

class Product (private var name : String, private var price: Double) {

    fun get()
    {
        if(price >= 0)
        {
            println("Product Name : $name, Product Price : $price")
        }
        else
        {
            throw IllegalArgumentException("Invalid Product Price")
        }
    }

    fun set(pdtName : String, pdtPrice: Double)
    {
        name = pdtName
        if(pdtPrice > 0)
        {
            price = pdtPrice
            println("Product Name : $name, Product Price : $price")

        }
        else
        {
            throw IllegalArgumentException("Invalid Product Price")
        }
    }
}