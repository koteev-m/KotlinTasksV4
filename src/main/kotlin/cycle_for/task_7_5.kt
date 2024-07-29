package cycle_for

fun main() {
    println("Введите колличество символов в пароле(минимум 6 символов!):")
    val inputLength = readln().toInt()

    if (inputLength < 6){
        println("Длина пароля должна быть минимум 6 символов!")
        return
    }

    val numbers = '0'..'9'
    val lowerChars = 'a'..'z'
    val upperChars = 'A'..'Z'

    val allChars = numbers + lowerChars + upperChars

    val password = StringBuilder()
    password.append(numbers.random())
    password.append(lowerChars.random())
    password.append(upperChars.random())

    for (i in 3..<inputLength){
        password.append(allChars.random())
    }

    val shufflePassword = password.toList().shuffled().joinToString("")

    println("Сгенерированный пароль: $shufflePassword")
}



//Создай программу, которая генерирует более сложные пароли.
//
//– пароль должен содержать цифры, строчные и заглавные буквы - должны присутствовать все три вида символов;
//– цифры и буквы должны располагаться в случайном порядке;
//– длина пароля должна задаваться пользователем;
//– минимальная длина пароля 6 символов.