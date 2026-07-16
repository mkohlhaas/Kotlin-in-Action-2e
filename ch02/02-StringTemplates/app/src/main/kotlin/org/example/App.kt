package org.example

fun main() {
  val input = readln()
  val name = input.ifBlank { "Kotlin" }
  println("Hello, $name!")
}
