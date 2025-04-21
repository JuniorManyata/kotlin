package com.example.c36a

fun main() {

    // Arithmetic operators

    var num1: Double = 10.6

    var num2: Double = 5.0

    var result: Double = 0.0

    result = num1 + num2

    println("num1 + num2 is $result")

    result = num1 - num2

    println("num1 - num2 is $result")

    result = num1 * num2

    println("num1 * num2 is $result")

    result = num1 / num2

    println("num1 / num2 is $result")

    result = num1 % num2

    println("num1 % num2 is $result")

    // Assignment operators

    var x: Int = 20

    var y: Int = 10

    var z: Int = 0

    z = x + y

    println("z = x + y = $z")

    z += x

    println("z += x = $z")

    z -= x

    println("z -= x = $z")

    z *= x

    println("z *= x = $z")

    z /= x

    println("z /= x = $z")

    z %= x

    println("z %= x = $z")

    // Unary operators

    var number: Double = 7.6

    var isCheck: Boolean = true

    println("+number = ${+number}")

    println("-number = ${-number}")

    println("++number = ${++number}")

    println("--number = ${--number}")

    println("!isCheck = ${!isCheck}")

    println("-----------------------------")

    var Result: Double = 4.7

    println("Result: $Result")

    // When the result++ is executed, the original value is evaluated first

    // and the value of result is increased only after that

    println("Result++: ${Result++}")

    // Equality and relational operators

    var a: Int = 5

    var b: Int = 5

    println("a == b: " + (a == b))

    println("a != b: " + (a != b))

    println("a < b: " + (a < b))

    println("a > b: " + (a > b))

    println("a >= b: " + (a >= b))

    println("a <= b: " + (a <= b))

    // Conditional operators

    var number1: Int = 5

    var number2: Int = 8

    var number3: Int = 12

    var resultt: Boolean = false

    // Conditional operator (&&)

    resultt = (number1 > number2) && (number3 > number2)

    println(resultt)

    // Conditional operator (||)

    resultt = (number1 > number2) || (number3 > number2)

    println(resultt)

    // Operator precedence

    // BODMAS

    var resulttt: Int = 5 + 2 * 4

    println("Resulttt = $resulttt")

    resulttt = (5 + 2) * 4

    println("Resulttt = $resulttt")

    var e: Int = 8

    var f: Int = 4

    var g: Int = 2

    var sum: Int = 0

    sum = e + --f + - -g

    println("x + --y + --z ::: $sum")

    // Range To() Function and "in" operator

    var myCharRange = 'a'.rangeTo('j')

    var testCharRange = 'a' <= 'j'

    var check = 'Z' in myCharRange // Changed to check against myCharRange

    println("myCharRange has Z: $check")

    println(myCharRange)

    // Console Input in Android App Development

    print("Enter name: ")

    var name: String? = readLine() // Changed readln() to readLine() for console input

    // The data user inputs is always a String so,

    // type conversion for data type other than String

    print("Enter age: ")

    var age: Int = readLine()!!.toInt() // Changed readln() to readLine() for console input

}