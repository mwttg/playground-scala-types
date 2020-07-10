package de.playground.experiment4

import java.nio.{ByteBuffer, ByteOrder}

import de.playground.experiment4.BaseTypes.BaseType

object Process {

  def extractFrom(content: Array[Byte], endian: ByteOrder, baseType: BaseType): Value[_ >: Int with Byte with Long <: AnyVal] = {
    baseType match {
      case BaseTypes.Enum => Value(ByteBuffer.wrap(content).order(endian).get & 0x0F)
      case BaseTypes.SInt8 => Value(ByteBuffer.wrap(content).order(endian).get)
      case BaseTypes.UInt8 => Value(ByteBuffer.wrap(content).order(endian).get & 0x0F)
      case BaseTypes.UInt32 => Value(ByteBuffer.wrap(content).order(endian).getInt & 0x00000000FFFFFFFFL)
    }
  }
}
