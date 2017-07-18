package fr.demandeatonton.collections

object ScalaArrays extends App {
  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

  for (i <- 0 to 2)
    print(greetStrings(i))

  // Appel implicite à la méthode update
  greetStrings.update(0, "Goodbye")
  for (i <- 0 to 2)
    print(greetStrings(i))

  // Création et initialisation
  val numNames = Array("zero", "one", "two")
  for (i <- 0 to 2)
    println(numNames(i))

}
