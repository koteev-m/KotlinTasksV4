package cycle_for

import kotlin.random.Random

fun main() {
    while (true) {
        val authCode = Random.nextInt(1000, 9999)
        println("Ваш код авторизации: $authCode")

        println("Введите код авторизации:")
        val userInput = readln()

        if (userInput == authCode.toString()) {
            println("Авторизация успешна! Добро пожаловать!")
            break
        }
        else{
            println("Неверный код авторизации. Попробуйте еще раз.")
        }
    }
}