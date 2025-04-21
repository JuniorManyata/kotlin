package com.example.c36a

import kotlin.random.Random // Importing Random for generating random numbers

fun main() {

    print("Please enter a number: ")

    var number: Int = readln().toInt() // Changed to directly read as Int

    if (number % 2 == 0) {

        println("$number is even")

    } else {

        println("$number is odd")

    }

    // If-Else - if ladder statement

    print("Please enter your age: ")

    var yourAge: Int = readln().toInt()

    if (yourAge < 13) {

        println("You are a child")

    } else if (yourAge < 19) {

        println("You are a teenager")

    } else {

        if (yourAge < 50) {

            println("You are an adult")

        } else {

            println("You are a senior")

        }

    }

    // Nested If statement

    println("Please enter 3 numbers: ")

    var number1: Int = readln().toInt()

    var number2: Int = readln().toInt()

    var number3: Int = readln().toInt()

    var largestNumber: Int

    if (number1 >= number2) {

        if (number1 >= number3) {

            largestNumber = number1

        } else {

            largestNumber = number3

        }

    } else {

        if (number2 >= number3) {

            largestNumber = number2

        } else {

            largestNumber = number3

        }

    }

    println("The largest number is $largestNumber")

    // when statement

    print("Please enter a day number of the week: ")

    var dayNumber: Int = readln().toInt()

    var day: String

    when (dayNumber) {

        1 -> day = "Sunday"

        2 -> day = "Monday"

        3 -> day = "Tuesday"

        4 -> day = "Wednesday"

        5 -> day = "Thursday"

        6 -> day = "Friday"

        7 -> day = "Saturday"

        else -> day = "Invalid day choice"

    }

    println(day)

    // for loop

    for (i in 1..9) { // Changed ≤..≤ to .. for range

        println(i)

    }

    var sum: Int = 0

    for (x in 0..5) { // Changed ≤..≤ to .. for range

        println(x)

        sum += x

    }

    sum = 0 // Resetting sum for the next loop

    for (x in 0..10) { // Changed ≤..≤ to .. for range

        if (x % 2 == 0) {

            println(x)

            sum += x

        }

    }

    println("The sum of even numbers is $sum")

    var vehicle = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")

    for (y in vehicle.indices) {

        println("The value in index $y is: " + vehicle[y])

    }

    // For each Loop

    vehicle.forEach { it: String ->

        println(it)

    }

    // while loop

    var i: Int = 0

    while (i < 5) {

        println(i)

        i++

    }

    // Factorial calculation

    var k = 1

    var fact = 1

    while (k < 6) { // Setting the conditions while k < 6

        fact *= k // fact = fact * k

        println("$k! = $fact")

        k++

    }

    // Infinite loop

    var randomNumber = Random.nextInt(0, 10000) // Corrected random number generation

    println("Please enter any number from 0 to 10000: ")

    while (true) { // Changed 2 > 1 to true for an infinite loop

        var userGuess: Int = readln().toInt()

        if (userGuess == randomNumber) {

            println("Congratulations! You won!")

            break

        } else if (userGuess < randomNumber) {

            println("Increase your guess")

        } else {

            println("Decrease your guess")

        }

    }

    // do-while

    var numberDoWhile = 1 // Changed variable name to avoid redeclaration

    do {

        println(numberDoWhile)

        numberDoWhile++

    } while (numberDoWhile <= 15)

}
