package if_when

import kotlin.random.Random

fun main() {

    val number1 = Random.nextInt(1, 11)
    val number2 = Random.nextInt(1, 11)
    val answer = number1 + number2

    println("Решите уравнение:")
    println("$number1 + $number2 = ?")

    val userAnswer = readln().toInt()

    val textResult = if (userAnswer == answer) "Добро пожаловать!"
    else "Доступ запрещен."

    println(textResult)
}