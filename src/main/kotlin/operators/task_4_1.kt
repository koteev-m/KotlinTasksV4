package operators

fun main() {
    val freeTableToday = 0
    val freeTableTomorrow = 4

    val reserveTableToday = (TOTAL_TABLES - freeTableToday) < TOTAL_TABLES
    println("Доступность столиков на сегодня: $reserveTableToday")

    val reserveTableTomorrow = (TOTAL_TABLES - freeTableTomorrow) <= TOTAL_TABLES
    println("Доступность столиков на завтра: $reserveTableTomorrow")
}

const val TOTAL_TABLES = 13