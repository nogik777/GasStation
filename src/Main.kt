fun main() {

    val azs = PetrolStation(55, 10000)

    val trafficGenerator = TrafficGenerator()
    val carArray = trafficGenerator.getTraffic()

    for (car in carArray){
        azs.refuel(car)
    }

    azs.showStatistics()

}