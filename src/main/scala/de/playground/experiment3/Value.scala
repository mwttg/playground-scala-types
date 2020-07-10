package de.playground.experiment3

sealed trait Box

final case class Value[T](v: T) extends Box
