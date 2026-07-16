package org.example

enum class Color(
  val r: Int,
  val g: Int,
  val b: Int
) {
  RED(255, 0, 0),
  ORANGE(255, 165, 0),
  YELLOW(255, 255, 0),
  GREEN(0, 255, 0),
  BLUE(0, 0, 255),
  INDIGO(75, 0, 130),
  VIOLET(238, 130, 238);

  fun rgb() = (r * 256 + g) * 256 + b
}

// as a stand-in for more complex measurement logic
fun measureColor() = Color.ORANGE

fun getWarmthFromSensor(): String {
  return when (val color = measureColor()) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm (red = ${color.r})"
    Color.GREEN -> "neutral (green = ${color.g})"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold (blue = ${color.b})"
  }
}

fun main() {
  println(getWarmthFromSensor())
}
