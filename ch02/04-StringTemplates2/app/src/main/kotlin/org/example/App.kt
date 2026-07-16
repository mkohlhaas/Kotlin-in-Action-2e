package org.example

fun main() {
  val name = "John"
  println("Hello, ${name.ifBlank { "someone" }}!")
}
