package if_when

import kotlin.random.Random

fun main() {
    val winnerNumbers = List(3) { Random.nextInt(0, 42) }

    println("Введите три числа от 0 до 42:")

    val userNumbers = mutableListOf<Int>()
    repeat(3) {
        val number = readln().toInt()
        userNumbers.add(number)
    }
    val matchedNumbers = winnerNumbers.intersect(userNumbers.toSet())
    val matchedCount = matchedNumbers.size

    when (matchedCount) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число, получаете утешительный приз.")
        else -> println("Вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: $winnerNumbers")

}