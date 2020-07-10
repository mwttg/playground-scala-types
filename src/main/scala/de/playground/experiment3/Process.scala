package de.playground.experiment3

object Process {

  def doSomething(item1: Box, item2: Box): Value[_ >: Int with String with Double] = {
    (item1, item2) match {
      case (Value(v1: Int), Value(v2: Int)) => Value(v1 + v2)
      case (Value(v1: String), Value(v2: String)) => Value(v1 + v2)
      case (Value(v1: Double), Value(v2: Double)) => Value(v1 + v2)
    }
  }
}
