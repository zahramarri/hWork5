class Generic<T>(private val a: T, private val b: T) {

    fun compare(): T? {
        if (a is Int && b is Int) {
            return if (a > b) {
                a
            } else if (b > a) {
                b
            } else {
                null
            }
        } else {
            a as String
            b as String
            return if (a > b) {
                a
            } else if (b > a) {
                b
            } else {
                null
            }
        }
    }
}
