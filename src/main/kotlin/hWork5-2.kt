abstract class Employee(
    val name: String,
    val age: Int,
    val hourRate: Double
) {

    abstract fun salary(hours: Double): Double
    override fun toString(): String {
        return "name: $name, age: $age, hour rate: $hourRate"
    }
}

class Manager(name: String, age: Int, hourRate: Double) : Employee(name, age, hourRate) {
    override fun salary(hours: Double): Double {
        return hourRate * hours
    }
}

class Clerk(name: String, age: Int, hourRate: Double) : Employee(name, age, hourRate) {
    override fun salary(hours: Double): Double {
        return hourRate * hours / 2
    }
}

data class Customer(val name: String, val age: Int, val gender: Gender)
enum class Gender {
    Male, Female
}
