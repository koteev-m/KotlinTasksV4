package inheritance

open class Liner(
    open val name: String,
    open val speed: Int,
    open val passengerCapacity: Int,
    open val cargoCapacity: Int,
) {
    open fun info() {
        println("$name: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }
}

class PassengerLiner(
    override val name: String = "Пассажирский лайнер",
    override val speed: Int = 30,
    override val passengerCapacity: Int = 3000,
    override val cargoCapacity: Int = 1000,
) : Liner(name, speed, passengerCapacity, cargoCapacity)

class CargoShip(
    override val name: String = "Грузовой корабль",
    override val speed: Int = 20,
    override val passengerCapacity: Int = 100,
    override val cargoCapacity: Int = 5000,
) : Liner(name, speed, passengerCapacity, cargoCapacity)

class Icebreaker(
    override val name: String = "Ледокол",
    override val speed: Int = 15,
    override val passengerCapacity: Int = 50,
    override val cargoCapacity: Int = 70,
) : Liner (name, speed, passengerCapacity, cargoCapacity) {
    fun breakIce() {
        println("Ледокол колет лед")
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







//В компьютерной игре есть три типа кораблей: лайнер, грузовой и ледокол. Все корабли построены на основе лайнера,
// но у каждого свой функционал и дополнительные свойства.
//
//У грузовых скорость меньше, а грузоподъемность больше. У ледоколов ниже и скорость, и вместительность,
// но они могут колоть лёд. Лайнер может вмещать наибольшее количество пассажиров.
//
//- спроектируй иерархию классов со значениями по умолчанию для каждого типа корабля;
//- создай по 1 экземпляру каждого типа корабля.