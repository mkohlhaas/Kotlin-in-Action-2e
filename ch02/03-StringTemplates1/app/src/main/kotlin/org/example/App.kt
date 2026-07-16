package org.example

fun main() {
  val name = "John"
  if (name.isNotBlank()) {
    println("Hello, $name, you ${name.length}-letter person! 😃")
  }
}
