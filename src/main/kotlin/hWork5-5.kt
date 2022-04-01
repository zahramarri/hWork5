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