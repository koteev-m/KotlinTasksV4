package inheritance

open class Liner(
    val name: String,
    val speed: Int = 30,
    val passengerCapacity: Int = 3000,
    val cargoCapacity: Int = 1000,
) {
    open fun info() {
        println("$name: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }
}

class CargoShip(
    name: String,
    speed: Int = 20,
    passengerCapacity: Int = 100,
    cargoCapacity: Int = 5000,
) : Liner(name, speed, passengerCapacity, cargoCapacity) {
    override fun info() {
        println("$name: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }
}

class Icebreaker(
    name: String,
    speed: Int = 15,
    passengerCapacity: Int = 50,
    cargoCapacity: Int = 200,
) : Liner(name, speed, passengerCapacity, cargoCapacity) {
    override fun info() {
        println("$name: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }

    fun breakIce() {
        println("Ледокол колет лёд")
    }
}

fun main() {
    val liner = Liner("Лайнер")
    liner.info()

    val cargoShip = CargoShip("Грузовой корабль")
    cargoShip.info()

    val icebreaker = Icebreaker("Ледокол")
    icebreaker.info()
    icebreaker.breakIce()
}