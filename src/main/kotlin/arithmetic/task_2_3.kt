package arithmetic

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457
    val MINUTES_IN_HOUR = 60

    val arrivalTimeMinutes = departureHour * MINUTES_IN_HOUR + departureMinute + travelTimeMinutes
    val arrivalHour = arrivalTimeMinutes / MINUTES_IN_HOUR
    val arrivalMinute = arrivalTimeMinutes % MINUTES_IN_HOUR

    println("Поезд прибудет в $arrivalHour:$arrivalMinute")
}