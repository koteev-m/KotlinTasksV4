package functions

fun main() {
    println("Введите длину пароля:")
    val inputLength = readln().toInt()

    val password = generatePassword(inputLength)
    println("Сгенерированный пароль: $password")
}

fun generateSpecialChar(): Char {
    val specialRanges = listOf(
        33 .. 47,
        58 .. 64,
        91 .. 96,
        123 .. 126,
    )

    val randomRange = specialRanges.random()
    return(randomRange.random().toChar())
}

fun generatePassword(length: Int): String {
    val password = StringBuilder()

    for (i in 0 until  length) {
        val randomChar = if (i % 2 == 0) {
            (48 .. 57).random().toChar()
        }
        else {
            generateSpecialChar()
        }
        password.append(randomChar)
    }
    return password.toString()
}


//Напиши программу, которая генерирует пароли. Пароль должен состоять из последовательно чередующихся цифр и специальных символов. Например, 4#4%2!.
//
//- пользователь сам задает длину пароля;
//- для генерации пароля должна быть отдельная функция, принимающая целочисленное значение длины пароля и возвращающая готовый пароль;
//- пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).