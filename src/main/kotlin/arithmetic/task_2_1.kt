package arithmetic

fun main() {

    val totalStudents = 4
    val firstStudentPoints = 3f
    val secondStudentPoints = 4f
    val thirdStudentPoints = 3f
    val fourthStudentPoints = 5f

    val averagePoint: Float = (firstStudentPoints + secondStudentPoints + thirdStudentPoints + fourthStudentPoints) / totalStudents
    println(averagePoint)
}