package inheritance

open class CelestiaBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isHabitable: Boolean,
) {
    open fun info() {
        println("Небесное тело: $name")
        println("Атмосфера: ${if (hasAtmosphere) "Да" else "Нет"}")
        println("Пригодность для высадки: ${if (isHabitable) "Да" else "Нет"}")
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean,
    val satellite: List<Satellite>
) : CelestiaBody(name, hasAtmosphere, isHabitable) {
    override fun info() {
        super.info()
        if (satellite.isNotEmpty()) {
            println("Спутники:")
            satellite.forEach { println("- ${it.name}")}
        }
        else {
            println("Спутников нет")
        }
    }
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isHabitable: Boolean,
) : CelestiaBody(name, hasAtmosphere, isHabitable)


fun main() {
    val phobos = Satellite("Фобос", false, false)
    val deimos = Satellite("Деймос", false, false)

    val mars = Planet(
        name = "Марс",
        hasAtmosphere = false,
        isHabitable = false,
        satellite = listOf(phobos, deimos)
    )

    mars.info()
}





//В компьютерной игре существуют планеты. У некоторых из них есть спутники.
//
//Планеты и спутники могут иметь атмосферу и могут быть пригодными для высадки.
//
//Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.
//
//- планета должна хранить список спутников.
//
//Создай планету с двумя спутниками и выведи в консоль название планеты и названия всех ее спутников.