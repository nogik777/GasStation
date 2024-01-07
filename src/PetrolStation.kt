class PetrolStation(private var pricePerLiter: Int, private var amountOfFuel: Int) {
    private var endAmount = amountOfFuel
    fun refuel(client: Array<Car>) {
        for (car in client) {
            if (endAmount >= car.volume){
                endAmount -= car.volume
                println("Авто заправлене на ${car.volume} літрів")
            }
            else println("Авто не заправлене потрібно ${car.volume} л. пального, його $endAmount")

        }
    }

    fun showStatistics() {
        val earnedMoney = (amountOfFuel - endAmount) * pricePerLiter
        println("  Статистика")
        println("Заробили: $earnedMoney грн.")
        println("Залишок пального: $endAmount")

    }
}