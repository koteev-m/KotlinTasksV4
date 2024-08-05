package functions

fun main() {
    println("Введите длину пароля:")
    val inputLength = readln().toInt()

    val password = generatePassword(inputLength)
    println("Сгенерированный пароль: $password")
}

fun generatePassword(length: Int): String {
    val digits = "0123456789"
    val specialChars = """!"#$%&'()*+,-./ """
    val password = StringBuilder()

    for (i in 0 until length) {
        if (i % 2 == 0){
            password.append(digits.random())
        }
        else {
            password.append(specialChars.random())
        }
    }
    return password.toString()
}




//Напиши программу, которая генерирует пароли. Пароль должен состоять из последовательно чередующихся цифр и специальных символов. Например, 4#4%2!.
//
//- пользователь сам задает длину пароля;
//- для генерации пароля должна быть отдельная функция, принимающая целочисленное значение длины пароля и возвращающая готовый пароль;
//- пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).