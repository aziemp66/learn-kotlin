fun main() {
  // label
  loopI@ for (i in 1..5) {
    loopJ@ for (j in 1..5) {
      if (j <= i) print("*")
    }
    println()
  }

  loopI@ for (i in 1..10) {
    loopJ@ for (j in 1..10) {
      println("$$i x $j = ${i * j}")
      if (j == 10) break@loopI
    }
  }

  loopI@ for (i in 1..10) {
    loopJ@ for (j in 1..10) {
      println("$$i x $j = ${i * j}")
      if (j == 10) continue@loopI
    }
  }

  fun test(name: String, param: (String) -> Unit): Unit = param(name)

  test("Azie") testLabel@{
    if (it == "Azie") return@testLabel
  }
  println("Azie")
}