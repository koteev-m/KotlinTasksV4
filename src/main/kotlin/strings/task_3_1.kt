package strings

fun main() {
    val name = "Иван!"
    var greeting = "Добрый день, "

    val dayGreeting = "$greeting$name"
    println(dayGreeting)

    greeting = "Добрый вечер, "
    val eveningGreeting = "$greeting$name"
    println(eveningGreeting)
}