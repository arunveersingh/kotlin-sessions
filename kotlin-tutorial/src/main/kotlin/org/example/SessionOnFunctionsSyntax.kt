package org.example

fun convertToUpperCase(message: String): String{
    val uppercaseMessage = message.uppercase()
    return uppercaseMessage.plus(" all in upper")
}

fun greet(message: String): String = if ("Hello" == message) message else "Namaste"


fun main() {
    print(greet("Hello there!"))
}