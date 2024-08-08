package functions

const val STORED_LOGIN = "user123"
const val STORED_PASSWORD = "pass123"

val cart = listOf("Apple", "Banana", "Orange")

fun generateToken(): String {
    val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
    return (1..32)
        .map { chars.random() }
        .joinToString("")
}

fun authorize(login: String, password: String): String? {
    return if (login == STORED_LOGIN && password == STORED_PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun getCart(token: String?): List<String>? {
    return if (token != null) {
        cart
    } else {
        null
    }
}

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    val token = authorize(login, password)

    if (token != null) {
        println("Авторизация прошла успешно. Ваш токен: $token")

        val userCart = getCart(token)

        if (userCart != null) {
            println("Содержимое вашей корзины: $userCart")
        }
        else {
            println("Не удалось получить содержимое корзины.")
        }
    }
    else {
        println("Неудачная авторизация. Проверьте логин и пароль.")
    }
}



//Задача 5* к Уроку 10
//
//Реализуй механизм авторизации в интернет-магазине и получения сохраненного ранее списка товаров.
//
//Метод авторизации принимает логин и пароль, верифицирует пользователя. Креды (credentials) для входа сохрани в константы.
//
//При успешной авторизации метод генерирует и возвращает токен доступа. Токен – текстовая строка, генерируемая методом авторизации
// (32 символа, которые включают цифры и буквы англ. алфавита – специальные библиотеки использовать не нужно).
// Подробнее https://ru.wikipedia.org/wiki/JSON_Web_Token
//
//При неудачной авторизации метод возвращает null.
//
//Метод получения корзины должен принимать токен и возвращать список товаров (содержимое переменной корзины, произвольный тип данных).
//
//Распечатай содержимое корзины или, если вернется null, оповести пользователя о неудачной авторизации. Переменные логин,
// пароль и корзина проинициализированы заранее и неизменяемы.