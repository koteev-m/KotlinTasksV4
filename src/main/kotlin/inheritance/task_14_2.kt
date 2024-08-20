package inheritance

open class Liner2(
    val name: String,
    val speed: Int,
    val passengerCapacity: Int,
    val cargoCapacity: Int,
) {
    open fun info() {
        println("$name: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }
    open fun load() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }
}

class PassengerLiner2(
    name: String = "Пассажирский лайнер"
) : Liner2(
    name = name,
    speed = 30,
    passengerCapacity = 3000,
    cargoCapacity = 1000,
)

class CargoShip2(
    name: String = "Грузовой корабль"
) : Liner2 (
    name = name,
    speed = 20,
    passengerCapacity = 100,
    cargoCapacity = 5000,
) {
    override fun load() {
        println("$name активирует погрузочный кран")
    }
}

class Icebreaker2(
    name: String = "Ледокол"
) : Liner2 (
    name = name,
    speed = 15,
    passengerCapacity = 50,
    cargoCapacity = 70,
) {
    fun breakIce() {
        println("$name колет лёд")
    }

    override fun load() {
        println("$name открывает ворота со стороны кормы")
    }
}


fun main() {
    val liner = PassengerLiner2()
    liner.info()
    liner.load()

    val cargoShip = CargoShip2()
    cargoShip.info()
    cargoShip.load()

    val iceBreaker = Icebreaker2()
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