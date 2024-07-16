package strings

fun main() {
    var moveNumber = 1
    var fromWhere = "E2"
    var where = "E4"
    val moveInformation = "[$fromWhere-$where;$moveNumber]"

    moveNumber += 1
    fromWhere = "D2"
    where = "D3"
    val newMoveInformation = "[$fromWhere-$where;$moveNumber]"
    println(newMoveInformation)
}