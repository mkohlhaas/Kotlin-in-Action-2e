package org.example

fun main() {
    val names = listOf("Joe", "Mary", "Jamie")
    val ages = listOf(22, 31, 22, 44, 0)
    val countries = listOf("DE", "NL", "US")
    println(names zip ages zip countries)
}
