package fr.demandeatonton.classes

import fr.demandeatonton.classes.ChecksumCalculator.calculate

object Summer extends App {
  val tests = Array("un", "deux", "trois")
  for(arg <- tests) {
    println(arg + ": " + calculate(arg))
  }
}
