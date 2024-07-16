package arithmetic

import kotlin.math.pow

fun main() {

    val initialDeposit = 70000
    val annualInterestRate = 0.167
    val years = 20

    val futureValue = initialDeposit * (1 + annualInterestRate).pow(years)
    val formattedResult = "%.3f".format(futureValue)

    println(formattedResult)
}