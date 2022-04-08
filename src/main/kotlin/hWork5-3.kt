class Generic<T: Comparable<T>?>(private val a: T, private val b: T) {

//    fun compare(): T? {
//        if (a is Int && b is Int) {
//            return if (a > b) {
//                a
//            } else if (b > a) {
//                b
//            } else {
//                null
//            }
//        } else {
//            a as String
//            b as String
//            return if (a > b) {
//                a
//            } else if (b > a) {
//                b
//            } else {
//                null
//            }
//        }
//    }

    fun compare(): T? {
        return when(a?.compareTo(b)) {
            1 -> a
            -1 -> b
            else -> null
        }
    }
}

fun main() {
    val test1 = Generic(4, 7)
    val test2 = Generic("a", "b")
    val test3 = Generic(1.0, 1.1)
    val test4 = Generic(a = false, b = true)

    println(test1.compare())
    println(test2.compare())
    println(test3.compare())
    println(test4.compare())
}
