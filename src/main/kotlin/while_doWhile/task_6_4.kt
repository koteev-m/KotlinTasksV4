package while_doWhile

import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 9)
    var attemp = 5

    println("Введите любое число от 1 до 9:")

    while (attemp > 0){
        val userNumber = readln().toInt()

        if (userNumber == randomNumber){
            println("Это была великолепная игра!")
            return
        }
        else{
            attemp--
            if (attemp > 0){
                println("Неверно, у Вас осталось $attemp попыток")
            }
            else{
                println("Было загадано число $randomNumber.")
            }
        }
    }

}
