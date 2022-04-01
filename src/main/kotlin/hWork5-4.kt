fun <T> ArrayList<T>.print() {
    println(this)
}

fun main() {
    val arrayList1 = arrayListOf<Int>(1, 2, 3)
    val arrayList2 = arrayListOf<String>("a", "aa", "aaa")
    val arrayList3 = arrayListOf<Boolean>(true, false, true)

    arrayList1.print()
    arrayList2.print()
    arrayList3.print()
}