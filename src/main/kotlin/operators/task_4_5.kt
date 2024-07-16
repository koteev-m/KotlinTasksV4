package operators

fun main() {
    println("наличие повреждений корпуса(true/false): ")
    var damage = readln().toBoolean()

    println("текущий состав экипажа: ")
    val numberOfCrew = readln().toInt()

    println("количество ящиков с провизией на борту: ")
    val boxesOfProvision = readln().toInt()

    println("благоприятность метеоусловий(true/false): ")
    val goodWeather = readln().toBoolean()

    if (((SHIP_WITHOUT_DAMAGE.also { damage = it }) && (numberOfCrew in MIN_CREW..MAX_CREW) &&
                (boxesOfProvision >= MIN_PROVISION_BOXES) && (goodWeather == SUNNY_WTHR)) ||
        ((damage == MINOR_DAMAGE) && (numberOfCrew == OPTIMAL_CREW)) && (goodWeather == SUNNY_WTHR) &&
        (boxesOfProvision >= MIN_PROVISION_BOXES)) {
        println("Корабль может отправиться в плавание.")
    }
    else{
        println("Корабль не может отправиться в плавание.")
    }
}

const val SUNNY_WTHR = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val OPTIMAL_CREW = 70
const val MIN_PROVISION_BOXES = 50
const val SHIP_WITHOUT_DAMAGE = true
const val MINOR_DAMAGE = true