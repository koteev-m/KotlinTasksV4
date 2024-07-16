package if_when

import java.util.*

fun main() {
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    println("Введите ваш год рождения:")
    val birthYear = readln().toInt()

    val age = currentYear - birthYear

    if (age >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ запрещен. Вам должно быть 18 лет или больше для доступа к этому контенту.")
    }

}

const val AGE_OF_MAJORITY = 18