package de.playground.experiment2

sealed trait Box

final case class Value[T](v: T) extends Box
