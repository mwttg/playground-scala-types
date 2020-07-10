package de.playground.experiment1

object Application {
  def main(args: Array[String]): Unit = {
    val i1 = Value(2)
    val i2 = Value(3)
    println(Process.doSomething(i1, i2))

    val i4 = Value("2")
    val i5 = Value("3")
    println(Process.doSomething(i4, i5))
  }
}
