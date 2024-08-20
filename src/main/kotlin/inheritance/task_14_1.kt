package inheritance

open class Liner(
    val name: String,
    val speed: Int,
    val passengerCapacity: Int,
    val cargoCapacity: Int,
) {
    open fun info() {
        println("$name: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }
}

class PassengerLiner(
    name: String = "Пассажирский лайнер"
) : Liner(
    name = name,
    speed = 30,
    passengerCapacity = 3000,
    cargoCapacity = 1000,
)

class CargoShip(
    name: String = "Грузовой корабль"
) : Liner (
    name = name,
    speed = 20,
    passengerCapacity = 100,
    cargoCapacity = 5000,
)

class Icebreaker(
    name: String = "Ледокол"
) : Liner (
    name = name,
    speed = 15,
    passengerCapacity = 50,
    cargoCapacity = 70,
) {
    fun breakIce() {
        println("$name колет лёд")
    }
}

fun main() {
    val passengerLiner = PassengerLiner()
    val cargoShip = CargoShip()
    val iceBreaker = Icebreaker()

    passengerLiner.info()
    cargoShip.info()
    iceBreaker.info()

    iceBreaker.breakIce()
}