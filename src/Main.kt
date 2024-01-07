fun main() {

    val azs = PetrolStation(55, 10000)

    val clientCar = Car(55)
    val clientCar2 = Car(45)

    azs.refuel(clientCar)
    azs.refuel(clientCar2)
    azs.refuel(clientCar2)

    azs.showStatistics()

}