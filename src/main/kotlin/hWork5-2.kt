abstract class Employee(
    private val name: String,
    private val age: Int,
    protected val hourRate: Double
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

fun main() {
    val manager1 = Manager("Ali", 52, 104.0)
    val manager2 = Manager("Reza", 42, 120.0)
    val manager3 = Manager("Farhad", 34, 120.0)
    val clerk1 = Clerk("Sama", 26, 110.0)

    println("-----print all the employees-----")
    println(manager1)
    println(manager2)
    println(manager3)
    println(clerk1)

    println("-----print total payment of all employees-----")
    println("Total payment for Ali is: " + manager1.salary(10.0))
    println("Total payment for Reza is: " + manager2.salary(10.0))
    println("Total payment for Farhad is: " + manager3.salary(10.0))
    println("Total payment for Sama is: " + clerk1.salary(10.0))

    val customer1 = Customer("Sara", 22, Gender.Female)
    val customer2 = Customer("Maryam", 30, Gender.Female)

    println("-----check if customer 1 and 2 are the same-----")
    println(customer1 == customer2)
}
