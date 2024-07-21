fun printHello(): Unit {
  println("Hello!")
}

fun sayHello(name: String): String {
  return "$name said Hello!"
}

fun OwnerPet(owner: String, pet: String): String {
  return "$owner is the owner of $pet"
}

fun String.hello(): String = "Hello From $this!"

infix fun String.to(type: String): String {
  if (type == "UP") {
    return this.uppercase()
  } else {
    return this.lowercase()
  }
}

fun Int.isEven(): Boolean {
  return if (this % 2 == 0) {
    true
  } else {
    false
  }
}

fun Int.getGrade(): Char? {
  return when {
    (this > 80) && (this <= 100) -> 'A'
    (this > 60) && (this <= 80) -> 'B'
    (this > 40) && (this <= 60) -> 'C'
    (this > 20) && (this <= 40) -> 'D'
    (this >= 0) && (this <= 20) -> 'F'
    else -> null
  }
}

fun main() {
  printHello()

  println(sayHello("Azie"))

  val owner = "John"
  val pet = "Chuck"

  println(OwnerPet(owner, pet))

  println(pet.hello())

  println("grazie" to "UP")

  val value = 99

  println(value.isEven())

  println(value.getGrade())
}