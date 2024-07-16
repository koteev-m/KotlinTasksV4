package operators

fun main() {
    val trainingDay = 4
    val isEven = trainingDay % 2 == 0

    println("""
    Упражнения для рук:    ${!isEven}
    Упражнения для пресса: ${!isEven}
    Упражнения для ног:    $isEven
    Упражнения для спины:  $isEven
""".trimIndent())
}