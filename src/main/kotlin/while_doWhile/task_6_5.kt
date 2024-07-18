package while_doWhile

import kotlin.random.Random

fun main() {
    var attempts = 3
    println("Для входа в приложение решите простой математический пример.")

    while (attempts > 0) {
        val number1 = Random.nextInt(1, 9)
        val number2 = Random.nextInt(1, 9)
        val currentAnswer = number1 + number2

        println("Сколько будет $number1 + $number2")
        val userAnswer = readln().toIntOrNull()

        if (userAnswer == currentAnswer) {
            println("Добро пожаловать!")
            return
        }
        else {
            attempts--
            if (attempts > 0){
                println("Неверно, у вас осталось $attempts попытки.")
            }
            else {
                println("Доступ запрещен")
            }
        }
    }
}
