package interface_and_abstract

interface Swimmable {
    fun swim()
}

interface Flyable {
    fun fly()
}

class Carp : Swimmable {
    override fun swim() {
        println("Карась плывет в воде")
    }
}

class Seagull : Swimmable, Flyable {
    override fun fly() {
        println("Чайка летит в небе")
    }

    override fun swim() {
        println("Чайка плывет по поверхности воды")
    }
}

class Duck : Swimmable, Flyable {
    override fun fly() {
        println("Утка летит в небе")
    }

    override fun swim() {
        println("Утка плывет по поверхности воды")
    }
}

fun main() {
    val carp = Carp()
    val seagull = Seagull()
    val duck = Duck()

    carp.swim()
    seagull.fly()
    seagull.swim()
    duck.fly()
    duck.swim()
}








//В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.
//
//- создай интерфейсы с методами передвижения для: карась, чайка, утка;
//- создай для каждого существа классы, реализующие соответствующие интерфейсы;
//- выведи сообщения в консоль, о том как они могут передвигаться.