package while_doWhile

fun main() {
    println("Придумайте логин:")
    val registeredLogin = readln()

    println("Придумайте пароль:")
    val registeredPassword = readln()

    println("Регистрация прошла успешно. Войдите в систему.")

    while (true) {
        println("Введите логин:")
        val login = readln()
        println("Введите пароль:")
        val password = readln()

        if (login == registeredLogin && password == registeredPassword) {
            println("Авторизация прошла успешно")
            break
        }
        else println("Неверный логин или пароль")
    }
}