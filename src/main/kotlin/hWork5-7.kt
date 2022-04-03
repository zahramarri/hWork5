fun convertBinaryToDecimal(Number: String): String? {
    var decimalNumber: String? = null

    for (i in Number.indices) {
        if (Number[i].code > 1 ) {
            println("Error: invalid number")
            return null
        }
    }

    if ('.' !in Number) {
        val binaryNumber = "$Number.0"
    }

    val integerPartOfBinaryNumber = Number.split(".")[0]

    val listOfDigits = mutableListOf<Int>()
    var temp = 1
    for (i in integerPartOfBinaryNumber.indices) {
        if (integerPartOfBinaryNumber[i] == '0') {
            continue
        } else {
            if (i == integerPartOfBinaryNumber.lastIndex) {
                temp = 1
            } else {
                for (j in 0..i) {
                    temp *= 2
                }
            }
        }
        listOfDigits.add(temp)
    }
    val integerPartOfDecimalNumber = listOfDigits.sum()


    return decimalNumber
}

fun convertDecimalToBinary(){}
