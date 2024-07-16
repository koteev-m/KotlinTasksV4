package arithmetic

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffPercentage = 20
    val totalPercent = 100

    val buffRatio = buffPercentage / totalPercent
    val bonusCrystalOre = crystalOre * buffRatio
    val bonusIronOre = ironOre * buffRatio

    println("""
    Бонусная кристаллическая руда: $bonusCrystalOre
    Бонусная металлическая руда: $bonusIronOre
""".trimIndent())
}