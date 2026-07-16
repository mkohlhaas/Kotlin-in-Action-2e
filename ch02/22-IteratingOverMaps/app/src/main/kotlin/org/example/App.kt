package org.example

import java.util.TreeMap

fun main() {
  val binaryReps = TreeMap<Char, String>()

  for (c in 'A'..'F') {
    val binary = c.code.toString(radix = 2)
    binaryReps[c] = binary
  }

  for ((letter, binary) in binaryReps) {
    println("$letter = $binary")
  }

  for ((_, binary) in binaryReps) {
    println(binary)
  }

  for (pair in binaryReps) {
    println(pair)
  }
}
