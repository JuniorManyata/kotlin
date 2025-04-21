package com.example.c36a

fun show(a: Int, b: Int) {

    println("You entered $a and $b")

}

fun add(a: Int, b: Int): Int {

    return a + b

}

fun findMinimumNumber(a: Int, b: Int): Int {

    return if (a > b) b else a
}

fun main() {

    println("Enter first number: ")

    var a: Int = readln().toInt() // Removed unnecessary !! operator

    println("Enter second number: ")

    var b: Int = readln().toInt() // Removed unnecessary !! operator

    show(a, b)

    var sum = add(a, b)

    println("Sum of the two entered numbers is $sum")

    var minimum = findMinimumNumber(a, b)

    println("And the smallest between $a and $b is $minimum")

}