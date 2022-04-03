fun convertBinaryToDecimal(number: String): String? {
    for (i in number.indices) {
        if (number[i] != '.' && Integer.parseInt(number[i].toString()) > 1) {
            println("Error: invalid number")
            return null
        }
    }

    var binaryNumber =""
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
    val decimalPartOfDecimalNumber = listOfDigits2.sum().toString().removePrefix("0.")

    return "$integerPartOfDecimalNumber.$decimalPartOfDecimalNumber"
}

fun convertDecimalToBinary() {}

