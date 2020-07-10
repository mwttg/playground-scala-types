package de.playground.experiment2

object Process {
  
  // makes no sense to return 'Any'
  def doSomething(item1: Box, item2: Box) = {
    (item1, item2) match {
      case (Value(v1: Int), Value(v2: Int)) => v1 + v2
      case (Value(v1: String), Value(v2: String)) => v1 + v2
    }
  }
}
