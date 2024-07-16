package operators

fun main() {
    val freeTableToday = 0
    val freeTableTomorrow = 4

    val reserveTableToday = (TOTAL_TABLES_2 - freeTableToday) < TOTAL_TABLES_2
    println("Доступность столиков на сегодня: $reserveTableToday")

    val reserveTableTomorrow = (TOTAL_TABLES_2 - freeTableTomorrow) <= TOTAL_TABLES_2
    println("Доступность столиков на завтра: $reserveTableTomorrow")
}

const val TOTAL_TABLES_2 = 13