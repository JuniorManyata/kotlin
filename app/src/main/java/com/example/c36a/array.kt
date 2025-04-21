package com.example.c36a

fun main(args: Array<String>) {

    // Corrected arrayOf instead of array0f

    var age = arrayOf(1, 2, 3)

    println(age.joinToString(", ")) // Print the array elements

    println("The first element of age is " + age[0])

    println("The second element of age is " + age[1])

    println("The third element of age is " + age[2])

    println(" **************************")

    // Corrected arrayOf instead of array0f

    var name = arrayOf("ram", "shyam", "Hari")

    name[1] = "Pratikshya" // This will cause an error because arrays in Kotlin are immutable

    println("The first element of name is " + name[0])

    println("The second element of name is " + name[1])

    println("The third element of name is " + name[2])

    println(name.size)

    // We can add value only after our array is initialized

    var age1 = ArrayList<Int>()

    age1.add(1)

    age1.add(1, 20) // Corrected the syntax for adding an element at a specific index

    age1.add(5)

    // We can add value directly in array while initializing variables.

    var age2 = arrayListOf<Int>(1, 20, 5)

    var nameList = arrayListOf<String>("sandis", "ram", "shyam") // Changed variable name to avoid redeclaration

    nameList.add("hari")

    nameList.add(4, "Sita") // Corrected the syntax for adding an element at a specific index

    nameList.remove("shyam")

    nameList.removeAt(0)

    println(nameList)

    var mixArrayList = arrayListOf<Any>("hello", 5, 2.0) // Corrected arrayList0f to arrayListOf

    println(mixArrayList[0])

    println(mixArrayList[1])

    println(mixArrayList[2])

}