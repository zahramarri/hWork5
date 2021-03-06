interface Vehicle {
    val name: String
    val maxSpeed: Int
    val capacity: Int
}

interface PublicTransportationVehicle : Vehicle

interface ServiceTransportationVehicle : Vehicle

interface PrivateTransportationVehicle : Vehicle

class Subway : PublicTransportationVehicle {
    override val name: String = "Subway"

    override val maxSpeed: Int = 28

    override val capacity: Int = 500
}

class Taxi : PublicTransportationVehicle {
    override val name: String = "Taxi"

    override val maxSpeed: Int = 80

    override val capacity: Int = 4
}

class Ambulance : ServiceTransportationVehicle {
    override val name: String = "Ambulance"

    override val maxSpeed: Int = 124

    override val capacity: Int = 5
}

class Truck : ServiceTransportationVehicle {
    override val name: String = "Truck"

    override val maxSpeed: Int = 85

    override val capacity: Int = 3
}

class SportCar : PrivateTransportationVehicle {
    override val name: String = "Sport Car"

    override val maxSpeed: Int = 400

    override val capacity: Int = 2
}

class HatchbackCar : PrivateTransportationVehicle {
    override val name: String = "Hatchback Car"

    override val maxSpeed: Int = 280

    override val capacity: Int = 4
}

fun main() {
    val listOfVehicles = Array<Vehicle?>(10) { null }
    for (i in listOfVehicles.indices) {
        listOfVehicles[i] = when ((1..6).random()) {
            1 -> Subway()
            2 -> Taxi()
            3 -> Ambulance()
            4 -> Truck()
            5 -> SportCar()
            else -> HatchbackCar()
        }
    }

    println("-----Vehicles sorted based on MAXIMUM SPEED-----")
//    val speedComparator = kotlin.Comparator { vehicle1: Vehicle, vehicle2: Vehicle
//        ->
//        vehicle1.maxSpeed - vehicle2.maxSpeed
//    }
    listOfVehicles.run {
//        sortedWith(speedComparator)
            sortedByDescending { vehicle -> vehicle?.maxSpeed }
//            .reversed()
            .forEach { println("${it?.name}: ${it?.maxSpeed}") }
    }

    println("-----Vehicles sorted based on MINIMUM CAPACITY-----")
    val capacityComparator = kotlin.Comparator { vehicle1: Vehicle, vehicle2: Vehicle
        ->
        vehicle1.capacity - vehicle2.capacity
    }
    listOfVehicles.run {
        sortedWith(capacityComparator)
            .forEach { println("${it?.name}: ${it?.capacity}") }
    }
}
