package inheritance

open class Liner2(
    val name: String,
    val speed: Int = 30,
    val passengerCapacity: Int = 3000,
    val cargoCapacity: Int = 1000,
) {
    open fun info() {
        println("$name: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }
    open fun load() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShip2(
    name: String,
    speed: Int = 20,
    passengerCapacity: Int = 100,
    cargoCapacity: Int = 10000,
) : Liner2(name, speed, passengerCapacity, cargoCapacity) {
    override fun info () {
        println("$name: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }
    override fun load() {
        println("$name активирует погрузочный кран")
    }
}

class IceBreaker2(
    name: String,
    speed: Int = 10,
    passengerCapacity: Int = 50,
    cargoCapacity: Int = 500,
) : Liner2(name, speed, passengerCapacity, cargoCapacity) {
    override fun info () {
        println("$name: скорость $speed узлов, пассажировместимость $passengerCapacity, грузоподъемность $cargoCapacity тонн")
    }
    fun breakIce() {
        println("$name колет лед")
    }
    override fun load() {
        println("$name открывает ворота со стороны кормы")
    }
}


fun main() {
    val liner = Liner2("Лайнер")
    liner.info()
    liner.load()

    val cargoShip = CargoShip2("Грузовой корабль")
    cargoShip.info()
    cargoShip.load()

    val iceBreaker = IceBreaker2("Ледокол")
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