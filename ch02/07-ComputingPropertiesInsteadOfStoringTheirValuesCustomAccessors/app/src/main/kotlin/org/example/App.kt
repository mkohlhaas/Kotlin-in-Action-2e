package org.example

class Rectangle(
  val height: Int,
  val width: Int,
) {
  val isSquare: Boolean
    get() {
      return height == width
    }
}

fun main() {
  val rect1 = Rectangle(41, 43)
  println("is square: ${rect1.isSquare}")

  val rect2 = Rectangle(43, 43)
  println("is square: ${rect2.isSquare}")
}
