package de.playground.experiment4

sealed trait Box

final case class Value[T](value: T) extends Box
