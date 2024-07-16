package while_doWhile

fun main() {
    var secondsInput = readln().toInt()
    val second = secondsInput

    while (secondsInput > 0){
        println("Секунд осталось: ${secondsInput--}")
        Thread.sleep(1000)
    }
    println("Прошло $second секунд(-ы)")

}