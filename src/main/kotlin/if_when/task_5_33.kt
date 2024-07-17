package if_when

fun main() {
    println("Напишите два любых числа от 0 до 42:")
    val userNumber1 = readln().toInt()
    val userNumber2 = readln().toInt()

    val firstNumberMatched = (userNumber1 == NUMBER1 || userNumber1 == NUMBER2)
    val secondNumberMatched = (userNumber2 == NUMBER1 || userNumber2 == NUMBER2)

    val textResult = if (firstNumberMatched && secondNumberMatched) "Поздравляем! Вы выиграли главный приз!"
    else if (firstNumberMatched || secondNumberMatched) "Вы выиграли утешительный приз!"
    else "Неудача!"
    println(textResult)

    println("Правильные числа: $NUMBER1 и $NUMBER2")
}

const val NUMBER1 = 6
const val NUMBER2 = 24
