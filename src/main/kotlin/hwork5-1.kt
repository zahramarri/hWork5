interface Vehicle {
    val name: String
    fun maxSpeed()
    fun maxCapacity()
}

interface PublicTransportationVehicle: Vehicle

interface ServiceTransportationVehicle: Vehicle

interface PrivateTransportationVehicle: Vehicle

class Subway: PublicTransportationVehicle {
    override val name: String
        get() = TODO("Not yet implemented")

    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}

class Taxi: PublicTransportationVehicle {
    override val name: String
        get() = TODO("Not yet implemented")

    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}

class Ambulance: ServiceTransportationVehicle {
    override val name: String
        get() = TODO("Not yet implemented")

    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}

class Truck: ServiceTransportationVehicle {
    override val name: String
        get() = TODO("Not yet implemented")

    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}

class SportCar: PrivateTransportationVehicle {
    override val name: String
        get() = TODO("Not yet implemented")

    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}

class HatchbackCar: PrivateTransportationVehicle {
    override val name: String
        get() = TODO("Not yet implemented")

    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}