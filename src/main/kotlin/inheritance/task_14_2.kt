package inheritance

open class Liner2(
    open val name: String,
    open val speed: Int,
    open val passengerCapacity: Int,
    open val cargoCapacity: Int,
) {
    open fun info() {
        println("$name: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }

    open fun load() {
        println("$name: выполняет стандартную погрузку")
    }
}

class PassengerLiner2(
    override val name: String = "Пассажирский лайнер",
    override val speed: Int = 30,
    override val passengerCapacity: Int = 3000,
    override val cargoCapacity: Int = 1000
) : Liner2(name, speed, passengerCapacity, cargoCapacity) {

    override fun load() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShip2(
    override val name: String = "Грузовой корабль",
    override val speed: Int = 20,
    override val passengerCapacity: Int = 100,
    override val cargoCapacity: Int = 5000
) : Liner2(name, speed, passengerCapacity, cargoCapacity) {

    override fun load() {
        println("$name активирует погрузочный кран")
    }
}

class Icebreaker2(
    override val name: String = "Ледокол",
    override val speed: Int = 15,
    override val passengerCapacity: Int = 50,
    override val cargoCapacity: Int = 70
) : Liner2(name, speed, passengerCapacity, cargoCapacity) {

    override fun load() {
        println("$name открывает ворота со стороны кормы")
    }

    fun breakIce() {
        println("$name колет лёд")
    }
}

fun main() {
    val passengerLiner = PassengerLiner2()
    val cargoShip = CargoShip2()
    val iceBreaker = Icebreaker2()

    passengerLiner.info()
    passengerLiner.load()

    cargoShip.info()
    cargoShip.load()

    iceBreaker.info()
    iceBreaker.load()
    iceBreaker.breakIce()
}








//Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.
//
//Каждый тип корабля обладает уникальным способом погрузки:
//
//- лайнер выдвигает горизонтальный трап со шкафута;
//- грузовой корабль активирует погрузочный кран;
//- ледокол открывает ворота со стороны кормы.
//
//Реализуй методы погрузки, специфичные для каждого вида корабля.
//
//Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.