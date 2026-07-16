package org.example

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader) {
  val number = try {
    Integer.parseInt(reader.readLine())
  } catch (e: NumberFormatException) {
    return
  }

  println(number)
}

fun main() {
  val reader1 = BufferedReader(StringReader("42"))
  readNumber(reader1)

  val reader2 = BufferedReader(StringReader("not a number"))
  readNumber(reader2)
}
