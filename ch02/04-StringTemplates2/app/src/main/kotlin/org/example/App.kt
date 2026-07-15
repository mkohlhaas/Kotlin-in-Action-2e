package org.example

fun main() {
    val name = readln()
    println("Hello, ${if (name.isBlank()) "someone" else name}!")
}
