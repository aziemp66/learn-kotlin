package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
// integer number
	var age: Byte = 21
	var height: Int = 168
	var distance: Short = 20000
	var balance: Long = 30000000L

	println(age)
	println(height)
	println(distance)
	println(balance)

	// unsigned integer number
	val uAge: UByte = 21u
	val uHeight: UInt = 168u
	val uDistance: UShort = 20000u
	val uBalance: ULong = 30000000u

	println(uAge)
	println(uHeight)
	println(uDistance)
	println(uBalance)

	// floating point number
	val value: Float = 98.98F
	val radius: Double = 2398134.194924

	println(value)
	println(radius)

	// literals
	val decimalLiteral: Int = 100
	val hexadecimalLiteral: Int = 0xFF
	val binaryLiteral: Int = 0b0001

	println(decimalLiteral)
	println(hexadecimalLiteral)
	println(binaryLiteral)

	// underscore
	age = 3_0
	height = 16_8
	distance = 2_000
	balance = 5_000_000_000

	println(age)
	println(height)
	println(distance)
	println(balance)

	// conversion
	val number: Byte = 100

	val int: Int = number.toInt()
	val short: Short = number.toShort()
	val long: Long = number.toLong()

	val float: Float = number.toFloat()
	val double: Double = number.toDouble()

	println(int)
	println(short)
	println(long)

	println(float)
	println(double)

	// boolean
	val benar: Boolean = true
	val salah: Boolean = false

	println(benar)
	println(salah)

	val lebihDari: Boolean = 7 > 3
	val kurangDari: Boolean = 10 < 7

	println(lebihDari)
	println(kurangDari)

	// string
	val firstName = "Azie"
	val address = """
		Palembang,
		Sumatera Selatan
	"""
	var fullName = """
		Azie Melza Pratama
	""".trimIndent()

	println(firstName)
	println(address)
	println(fullName)

	// menggabungkan string

	val lastName = "Melza Pratama"
	fullName = firstName + " " + lastName

	println(fullName)

	// string concatination

	val ownerAndBalance = "$fullName : \$$balance"
	println(ownerAndBalance)
}