fun convertBinaryToDecimal(Number: String): String? {
    var decimalNumber: String? = null

    for (i in Number.indices) {
        if (Number[i].code > 1) {
            println("Error: invalid number")
            return null
        }
    }

    if ('.' !in Number) {
        val binaryNumber = "$Number.0"
    }

    val integerPartOfBinaryNumber = Number.split(".")[0].reversed()

    val listOfDigits1 = mutableListOf<Int>()
    for (i in integerPartOfBinaryNumber.indices) {
        var temp1 = 1
        if (integerPartOfBinaryNumber[i] == '0') {
            continue
        } else {
            if (i == 0) {
                temp1 = 1
            } else {
                for (j in 1..i) {
                    temp1 *= 2
                }
            }
        }
        listOfDigits1.add(temp1)
    }
    val integerPartOfDecimalNumber = listOfDigits1.sum()

   return decimalNumber
}

fun convertDecimalToBinary() {}
