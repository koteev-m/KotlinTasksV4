package cycle_for

fun main() {
    println("Введите число:")
    val inputNumber = readln().toInt()

    for (i in 0..inputNumber step 2) {
        println(i)
    }
}