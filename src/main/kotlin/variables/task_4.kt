package variables

fun main() {
    val length: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Float = 0.075f
    val seconds: Short = 6480
    val typeOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000
    println("""
        Расстояние - $length
        Возраст - $age
        Часть дня - $partOfDay
        Секунды - $seconds
        Часть года - $typeOfYear
        Апогей орбиты - $apogee
    """.trimIndent())
}