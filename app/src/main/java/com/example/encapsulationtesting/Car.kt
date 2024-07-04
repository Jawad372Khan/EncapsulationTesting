package com.example.encapsulationtesting

class Car (private var make : String, private var model : String, private var mileage : Int) {

    fun get()
    {
        if (mileage >= 0){
            println("Make : $make, Model : $model, Milage : $mileage")
        }
        else
        {
            throw IllegalArgumentException("Invalid Car Milage")
        }

    }
    fun set (carMake : String, carModel : String, carMilage : Int)
    {
        make = carMake
        model = carModel
        if (carMilage > 0){
            mileage = carMilage
            println("Make : $make, Model : $model, Milage : $mileage")
        }
        else
        {
            throw IllegalArgumentException("Invalid Car Milage")
        }
    }
}