package cycle_for

fun main() {
    val length = 6
    val chars = ('a'..'z').toList()
    val numbers = ('0'..'9').toList()
    val password = StringBuilder()

    for (i in 0..<length) {
        if (i % 2 == 0) {
            password.append(chars.random())
        }
        else{
            password.append(numbers.random())
        }
    }
    println(password.toString())
}