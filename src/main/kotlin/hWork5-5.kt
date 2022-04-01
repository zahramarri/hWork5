fun <T> List<T>.slice(slicer: Int) {
    when {
        slicer > this.size -> println("impossible to slice")
        slicer < this.size -> {
            println(this.slice(0..slicer))
            println(this.slice(slicer + 1..this.lastIndex))
        }
        else -> println(this)
    }
}

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf('a', 'b', 'c', 'd', 'e', 'f', 'g')

    println("-----slice list 1-----")
    list1.slice(2)

    println("-----slice list 2-----")
    list2.slice(3)
}