package while_doWhile

fun main() {
    println("Придумайте логин:")
    val registeredLogin = readln()

    println("Придумайте пароль:")
    val registeredPassword = readln()

    println("Регистрация прошла успешно. Войдите в систему.")

    do {
        println("Введите логин:")
        val login = readln()
        println("Введите пароль:")
        val password = readln()
    } while (
        login != registeredLogin || password != registeredPassword
    )

    println("Авторизация прошла успешно!")

}