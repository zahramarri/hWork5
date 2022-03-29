interface Vehicle {
    abstract val name: String
    abstract fun maxSpeed()
    abstract fun maxCapacity()
}

interface PublicTransportationVehicle: Vehicle {
    override val name: String
        get() = TODO("Not yet implemented")

    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}

interface PrivateTransportationVehicle: Vehicle {
    override val name: String
        get() = TODO("Not yet implemented")

    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}

interface ServiceTransportationVehicle: Vehicle {
    override val name: String
        get() = TODO("Not yet implemented")

    override fun maxSpeed() {
        TODO("Not yet implemented")
    }

    override fun maxCapacity() {
        TODO("Not yet implemented")
    }
}