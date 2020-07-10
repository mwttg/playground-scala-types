package de.playground.experiment3

object Application {

  def main(args: Array[String]): Unit = {
    val item1 = Value(1)
    val item2 = Value(2)
    val r1 = Process.doSomething(item1, item2);
    println(s"${r1.v} type==Int? ${r1.v.isInstanceOf[Int]}")

    val item3 = Value("3")
    val item4 = Value("4")
    val r2 = Process.doSomething(item3, item4)
    println(s"${r2.v} type==String? ${r2.v.isInstanceOf[String]}")
  }
}
