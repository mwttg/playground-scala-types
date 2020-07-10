package de.playground.experiment4

import java.nio.ByteOrder

object Application {

  def main(args: Array[String]): Unit = {
    val content1 = Array[Byte](-23)
    val r1 = Process.extractFrom(content1, ByteOrder.BIG_ENDIAN, BaseTypes.SInt8)
    println(r1.value)

    val r2 = Process.extractFrom(content1, ByteOrder.BIG_ENDIAN, BaseTypes.UInt8)
    println(r2.value)

    val content2 = Array[Byte](-23, 95, 34, 56)
    val r3 = Process.extractFrom(content2, ByteOrder.BIG_ENDIAN, BaseTypes.UInt32)
    println(r3.value)
  }
}
