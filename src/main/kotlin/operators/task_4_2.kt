package operators

fun main() {
    val category = "'Average'"
    val cargoOneWeight = 20
    val cargoOneVolume = 80
    val cargoTwoWeight = 50
    val cargoTwoVolume = 100

    val averageCargoOne = (cargoOneWeight in (WEIGHT_FROM..WEIGHT_UP_TO)) && (cargoOneVolume < VOLUME)
    println("Груз с весом $cargoOneWeight кг и объемом $cargoOneVolume л соответствует категории $category: $averageCargoOne")

    val  averageCargoTwo = (cargoTwoWeight in (WEIGHT_FROM..WEIGHT_UP_TO)) && (cargoTwoVolume < VOLUME)
    println("Груз с весом $cargoTwoWeight кг и объемом $cargoTwoVolume л соответствует категории $category: $averageCargoTwo")

}

const val WEIGHT_FROM = 35
const val WEIGHT_UP_TO = 100
const val VOLUME = 100