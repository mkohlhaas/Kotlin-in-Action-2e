package org.example

data class Customer(val name: String, val postalCode: Int)

fun main() {
    val bob = Customer("Bob", 973293)
    println(bob.copy(postalCode = 382555))
}
