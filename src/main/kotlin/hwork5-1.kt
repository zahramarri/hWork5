interface Vehicle {
    val name: String
    val maxSpeed: Int
    val maxCapacity: Int

//    override fun compareTo(other: Vehicle): Int {
//        return when {
//        this.maxCapacity > other.maxCapacity -> 1
//        this.maxCapacity < other.maxCapacity -> - 1
//        else -> 0
//        }
//    }
}

interface PublicTransportationVehicle : Vehicle

interface ServiceTransportationVehicle : Vehicle

interface PrivateTransportationVehicle : Vehicle

class Subway : PublicTransportationVehicle {
    override val name: String = "Subway"

    override val maxSpeed: Int = 28

    override val maxCapacity: Int = 500
}

class Taxi : PublicTransportationVehicle {
    override val name: String = "Taxi"

    override val maxSpeed: Int = 80

    override val maxCapacity: Int = 4
}

class Ambulance : ServiceTransportationVehicle {
    override val name: String = "Ambulance"

    override val maxSpeed: Int = 124

    override val maxCapacity: Int = 5
}

class Truck : ServiceTransportationVehicle {
    override val name: String = "Truck"

    override val maxSpeed: Int = 85

    override val maxCapacity: Int = 3
}

class SportCar : PrivateTransportationVehicle {
    override val name: String = "Sport Car"

    override val maxSpeed: Int = 400

    override val maxCapacity: Int = 2
}

class HatchbackCar : PrivateTransportationVehicle {
    override val name: String = "Hatchback Car"

    override val maxSpeed: Int = 280

    override val maxCapacity: Int = 4
}

fun main() {
    val listOfVehicles = Array<Vehicle?>(10) { null }
    for (i in listOfVehicles.indices) {
        val randomObj = when ((1..6).random()) {
            1 -> Subway()
            2 -> Taxi()
            3 -> Ambulance()
            4 -> Truck()
            5 -> SportCar()
            else -> HatchbackCar()
        }
        listOfVehicles[i] = randomObj
    }

    println("-----Vehicles sorted based on MAXIMUM SPEED-----")
    val speedComparator = kotlin.Comparator { vehicle1: Vehicle, vehicle2: Vehicle
        ->
        vehicle1.maxSpeed - vehicle2.maxSpeed
    }
    listOfVehicles.run {
        sortedWith(speedComparator)
            .reversed()
            .forEach { println("${it?.name}: ${it?.maxSpeed}") }
    }

    println("-----Vehicles sorted based on MINIMUM CAPACITY-----")
    val capacityComparator = kotlin.Comparator { vehicle1: Vehicle, vehicle2: Vehicle
        ->
        vehicle1.maxCapacity - vehicle2.maxCapacity
    }
    listOfVehicles.run {
        sortedWith(capacityComparator)
            .forEach { println("${it?.name}: ${it?.maxCapacity}") }
    }
}
