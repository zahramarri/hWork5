interface Vehicle {
    val name: String
    val maxSpeed: Int
    val maxCapacity: Int
}

interface PublicTransportationVehicle: Vehicle

interface ServiceTransportationVehicle: Vehicle

interface PrivateTransportationVehicle: Vehicle

class Subway: PublicTransportationVehicle {
    override val name: String = "Subway"

    override val maxSpeed: Int = 28

    override val maxCapacity: Int = 500
}

class Taxi: PublicTransportationVehicle {
    override val name: String = "Taxi"

    override val maxSpeed: Int = 80

    override val maxCapacity: Int = 4
}

class Ambulance: ServiceTransportationVehicle {
    override val name: String = "Ambulance"

    override val maxSpeed: Int = 124

    override val maxCapacity: Int = 5
}

class Truck: ServiceTransportationVehicle {
    override val name: String = "Truck"

    override val maxSpeed: Int = 85

    override val maxCapacity: Int = 3
}

class SportCar: PrivateTransportationVehicle {
    override val name: String = "Sport Car"

    override val maxSpeed: Int = 400

    override val maxCapacity: Int = 2
}

class HatchbackCar: PrivateTransportationVehicle {
    override val name: String = "Hatchback Car"

    override val maxSpeed: Int = 280

    override val maxCapacity: Int = 4
}

fun main() {
    val listOfCars = mutableListOf<Any>()
    for (i in 1..10) {
        when((1..6).random()) {
            1 -> listOfCars.add(Subway())
            2 -> listOfCars.add(Taxi())
            3 -> listOfCars.add(Ambulance())
            4 -> listOfCars.add(Truck())
            5 -> listOfCars.add(SportCar())
            else -> listOfCars.add(HatchbackCar())
        }
    }
}