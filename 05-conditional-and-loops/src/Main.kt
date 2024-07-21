fun main() {
  // if, if else and else
  val grade = (Math.random() * 100).toInt() + 1
  val finalGrade: Char
  val passingGrade = 50

  println("Your grade is : $grade")
  if (grade >= 85) {
    finalGrade = 'A'
  } else if (grade >= 70) {
    finalGrade = 'B'
  } else if (grade >= passingGrade) {
    finalGrade = 'C'
  } else if (grade >= 25) {
    finalGrade = 'D'
  } else {
    finalGrade = 'E'
  }

  when (finalGrade) {
    'A' -> println("You Got an A")
    'B' -> println("You Got a B")
    'C' -> println("You Got a C")
    'D' -> println("You Got a D")
    'E' -> println("You got an E")
    else -> println("Your Grade is missing")
  }

  when (finalGrade) {
    is Char -> println("Grade Format is Correct")
    !is Char -> println()
  }

  val passValues = arrayOf('A', 'B', 'C')
  when (finalGrade) {
    in passValues -> println("Congrats! you passed the test")
    !in passValues -> println("Sorry, you didn't pass")
  }

  when {
    grade >= 80 -> println("Advice : You are doing very well")
    grade <= 25 -> println("Advice : You need to study harder")
  }

  val names = arrayOf("Azie", "Ledib", "Haiba", "Fadhil")
  for (v in names) {
    print("$v ")
  }
  println()

  for (value in 0..100) {
    if (value % 2 == 0 && value % 9 == 0) println(value)
  }

  for (value in 1000 downTo 1 step 77)
    println(value)

  var a = (Math.random() * 50).toInt() + 1
  while (a < 50) {
    println("Value : $a")
    a++
  }

  var i = (Math.random() * 10).toInt() + 1
  do {
    println("Count $i")
    i++
  } while (i <= 10)

  var b = 0
  while (true) {
    i++
    if (i > 100) {
      println("Broken")
      break
    }
  }

  for (c in 1..10) {
    if (c % 2 == 0) continue
    println(c)
  }
}