fun main() {
  // tail recursion
  tailrec fun display(value: Int) {
    println(value)
    if (value > 0) display(value - 1)
  }
  display(3)

  tailrec fun factorialTail(value: Int, total: Int = 1): Int {
    if (value == 1) return total

    return factorialTail(value - 1, total * value)
  }

  println(factorialTail(5))

  // lambda expression
  val lambdaUpperCase: (String) -> String = {
    it.uppercase()
  }
  val name = lambdaUpperCase("Azie")

  println(name)

  fun toUpperCase(value: String): String = value.uppercase()

  val lambdaUpperCaseMethodReference: (String) -> String = ::toUpperCase

  println(lambdaUpperCaseMethodReference(name))

  fun higherOrderHello(value: String, transformer: (String) -> String): String {
    return "Hello ${transformer(value)}"
  }

  val upperTransformer = { value: String -> value.uppercase() }

  println(higherOrderHello("Joseph", upperTransformer))

  // trailing lambda
  val result1 = higherOrderHello("Azie") { value: String ->
    value.uppercase()
  }
  println(result1)

  // anonymous function
  val anonymousUpper = fun(value: String): String {
    if (value.isBlank()) {
      return "Ups"
    }
    return value.uppercase()
  }

  val result2 = higherOrderHello("Jeremy", anonymousUpper)
  println(result2)

  // closure
  var counter = 0
  val lambdaIncrement: () -> Unit = { counter++ }

  lambdaIncrement()
  lambdaIncrement()
  println(counter)

  // inline
  println(inlineHello { "Azie Melza Pratama" })
  println(inlineHello({"John"},{"Smith"}))
}

// inline functions
inline fun inlineHello(name: () -> String): String {
  return "Hello ${name()}"
}

inline fun inlineHello(firstName: () -> String, noinline lastName: () -> String): String {
  return "Hello ${firstName()} ${lastName()}"
}
