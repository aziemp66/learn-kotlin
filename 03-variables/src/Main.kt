// constant
const val APP_VERSION = "v1.32"

fun main() {
    // mutable
    var firstName:String = "Azie"
    var lastName = "Melza Pratama"

    println("$firstName $lastName")

    // immutable
    val citizenNumber = 741045142L
    // error because val is immutable
    // citizenNumber = 194145L

    // nullable
    var isMarried : Boolean? = true
    isMarried = null

    // error because is married have a possiblity of null
    // if (isMarried) println("Congratulations")

    // constant
    // immutable and must be global variable
    println(APP_VERSION)
}