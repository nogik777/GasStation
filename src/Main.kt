fun main() {

    val azs = PetrolStation(55, 1000)

    val trafficGenerator = TrafficGenerator()
    val carArray = trafficGenerator.getTraffic()

    azs.refuel(carArray)

    azs.showStatistics()

}