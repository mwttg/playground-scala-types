package de.playground.experiment1

object Process {

  def doSomething(item1: Value[Int], item2: Value[Int]): Int = {
    item1.v + item2.v
  }

  def doSomething(item1: Value[String], item2: Value[String]): String = {
    item1.v + item2.v
  }
}
