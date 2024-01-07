class PetrolStation(private var pricePerLiter: Int, private var amountOfFuel: Int) {
    private var endAmount = amountOfFuel
    fun refuel(client: Car) {
        endAmount -= client.volume
        println("Авто заправлене на ${client.volume} літрів")
    }

    fun showStatistics() {
        val earnedMoney = (amountOfFuel - endAmount) * pricePerLiter
        println("  Статистика")
        println("Заробили: $earnedMoney грн.")
        println("Залишок пального: $endAmount")

    }
}