package org.example

class Rectangle(val height: Int, val width: Int) {
  val isSquare: Boolean
    get() = height == width
}

fun createUnitSquare(): Rectangle {
  return Rectangle(1, 1)
}

fun main() {
  val rect = Rectangle(41, 43)
  println("${rect.isSquare}")

  val unitRect = createUnitSquare()
  println("${unitRect.isSquare}")
}
