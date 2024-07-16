package strings

fun main() {
    val moveInformation = "D2-D4;0"

    val (fromWhere, where, moveNumber) = moveInformation.split("-", ";")

    println("Номер хода: $moveNumber")
    println("Откуда: $fromWhere")
    println("Куда: $where")
}