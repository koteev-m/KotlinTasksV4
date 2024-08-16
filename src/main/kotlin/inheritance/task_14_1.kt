package inheritance

open class Liner(
    val speed: Int = 30,
    val passengerCapacity: Int = 3000,
    val cargoCapacity: Int = 1000,
) {
    open fun info() {
        println("Лайнер: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }
}

class CargoShip(
    speed: Int = 20,
    passengerCapacity: Int = 100,
    cargoCapacity: Int = 5000,
) : Liner(speed, passengerCapacity, cargoCapacity) {
    override fun info() {
        println("Грузовой корабль: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }
}

class Icebreaker(
    speed: Int = 15,
    passengerCapacity: Int = 50,
    cargoCapacity: Int = 200,
) : Liner(speed, passengerCapacity, cargoCapacity) {
    override fun info() {
        println("Ледокол: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }

    fun breakIce() {
        println("Ледокол колет лёд")
    }
}

fun main() {
    val liner = Liner()
    liner.info()

    val cargoShip = CargoShip()
    cargoShip.info()

    val icebreaker = Icebreaker()
    icebreaker.info()
    icebreaker.breakIce()
}