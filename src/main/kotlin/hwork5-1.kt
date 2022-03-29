interface Vehicle {
    val name: String
    fun maxSpeed()
    fun maxCapacity()
}

interface PublicTransportationVehicle: Vehicle

interface PrivateTransportationVehicle: Vehicle

interface ServiceTransportationVehicle: Vehicle