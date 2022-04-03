fun convertBinaryToDecimal(number: String): String? {
    for (i in number.indices) {
        if (number[i] != '.' && Integer.parseInt(number[i].toString()) > 1) {
            println("Error: invalid number")
            return null
        }
    }

    var binaryNumber = number
    if ('.' !in number) {
        binaryNumber = "$number.0"
    }

    val integerPartOfBinaryNumber = binaryNumber.split(".")[0].reversed()

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

    var decimalPartOfDecimalNumber = "0"

    if (binaryNumber.split(".").size > 1) {
        val decimalPartOfBinaryNumber = binaryNumber.split(".")[1]

        val listOfDigits2 = mutableListOf<Double>()
        for (i in decimalPartOfBinaryNumber.indices) {
            var temp2 = 1.0
            if (decimalPartOfBinaryNumber[i] == '0') {
                continue
            } else {
                for (j in 0..i) {
                    temp2 /= 2
                }
            }
            listOfDigits2.add(temp2)
        }
        decimalPartOfDecimalNumber = listOfDigits2.sum().toString().removePrefix("0.")
    }

    return "$integerPartOfDecimalNumber.$decimalPartOfDecimalNumber"
}

fun convertDecimalToBinary(number: String): String {
    var decimalNumber = number
    if ('.' !in number) {
        decimalNumber = "$number.0"
    }

    val integerPartOfDecimalNumber = decimalNumber.split(".")[0]

    var quotient = integerPartOfDecimalNumber.toInt()
    var integerPartOfBinaryNumber = ""
    while (quotient >= 2) {
        val lastDivisor = quotient
        quotient /= 2
        val reminder = lastDivisor - (quotient * 2)
        integerPartOfBinaryNumber = reminder.toString() + integerPartOfBinaryNumber
    }
    integerPartOfBinaryNumber = quotient.toString() + integerPartOfBinaryNumber

    var decimalPartOfBinaryNumber = "0"
    if (decimalNumber.split(".").size > 1) {
        val decimalPartOfDecimalNumber = decimalNumber.split(".")[1]

        var multiple = ("0.$decimalPartOfDecimalNumber").toDouble()
        while (multiple != 0.0 && multiple != 1.0) {
            multiple *= 2
            decimalPartOfBinaryNumber += multiple.toString().split('.')[0]
            multiple = ("0." + multiple.toString().split('.')[1]).toDouble()
        }
    }

    return "$integerPartOfBinaryNumber.$decimalPartOfBinaryNumber"
}


fun main() {
    println(convertDecimalToBinary("8.09375"))
    println(convertDecimalToBinary("65"))

    println(convertBinaryToDecimal("1011"))
    println(convertBinaryToDecimal("0.1011"))
}
