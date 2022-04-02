fun main() {
    //O(1)
    val n = 5
    println("Your input is: $n")

    //O(n)
    for (i in 0 until n) {
        println("Your output is $i")
    }

    //O (n^3 + n^2)
    for (i in 1..n) {
        for (j in 1..n) {
            println("Your output is $i and $j")

        }
        for (k in 1..factorial(n)) {
            println("Your output is $k")
        }
    }
}

fun factorial(n: Int): Int {
    var factorial = 1
    for (i in 2..n) {
        factorial *= n
    }
    return factorial
}
