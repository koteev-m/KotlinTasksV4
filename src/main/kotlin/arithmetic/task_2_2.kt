package arithmetic

fun main() {
    val numberOfEmployees = 50
    val salaryOneEmployee = 30000
    val numberOfTrainees = 30
    val salaryOneTrainee = 20000

    val salaryOnlyEmployees = numberOfEmployees * salaryOneEmployee
    val salaryOnlyTrainees = numberOfTrainees * salaryOneTrainee
    val totalSalary = salaryOnlyTrainees + salaryOnlyEmployees
    val averageSalary = totalSalary / (numberOfEmployees + numberOfTrainees)

    println(salaryOnlyEmployees)
    println(totalSalary)
    println(averageSalary)
}