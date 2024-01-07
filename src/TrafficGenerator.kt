class TrafficGenerator {
    fun getTraffic(): Array<Car>{
        var traffic: Array<Car> = arrayOf()
        val rndNumbOfCars = (1..100).random()
        for (car in 0..rndNumbOfCars){
            val rndVolume = (1..100).random()
            traffic+=Car(rndVolume)
        }
        return traffic
    }

}