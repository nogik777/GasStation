class TrafficGenerator {
    fun getTraffic(): List<Car>{
        val traffic: MutableList<Car> = mutableListOf()
        val rndNumbOfCars = (1..100).random()
        for (car in 0..rndNumbOfCars){
            val rndVolume = (1..100).random()
            traffic.add(car, Car(rndVolume))
        }
        return traffic
    }

}