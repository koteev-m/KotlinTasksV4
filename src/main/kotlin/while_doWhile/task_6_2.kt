package while_doWhile

fun main() {
    println("Введите количество секунд:")
    val secondsInput = readln().toInt()

    Thread.sleep(secondsInput * 1000L)

    println("Прошло $secondsInput секунд(-ы)")

}