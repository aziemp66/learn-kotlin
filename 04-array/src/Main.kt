fun main() {
  // array
  val members: Array<String>
  members = arrayOf("Azie", "Ledib", "Fadhil")
  val azie = members[0]
  val ledib = members[1]
  val fadhil = members.get(2)

  println(members.contentToString())

  // nullable array (array of nulls)
  val names: Array<String?>
  names = arrayOfNulls(5)
  names.set(0, "Wakwaw")
  names.set(1, null)
  names.set(2, "Jojo")
  names[3] = null
  names[4] = "Dio"

  println(names.contentToString())

  // range
  val range = 0..100
  val reverseRange = 100 downTo 0
  val stepRange = 0..100 step 5

  println(range.average())
  println(reverseRange.contains(101))
  println(stepRange.step(7))
}