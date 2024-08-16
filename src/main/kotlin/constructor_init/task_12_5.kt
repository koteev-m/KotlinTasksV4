package constructor_init

import kotlin.math.roundToInt
import kotlin.random.Random

class AverageTemperature(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val hasPrecipitation: Boolean
)


fun main() {
    val weatherData = mutableListOf<AverageTemperature>()

    for (i in 1 .. 30) {
        val dayTemp = Random.nextInt(22, 28)
        val nightTemp = Random.nextInt(16, 20)
        val hasPrecipitation = Random.nextBoolean()

        weatherData.add(AverageTemperature(dayTemp, nightTemp, hasPrecipitation))
    }

    val dayTemperatures = weatherData.map { it.dayTemperature }
    val nightTemperatures = weatherData.map { it.nightTemperature }

    val precipitationDays = weatherData.count { it.hasPrecipitation }

    val averageDayTemp = dayTemperatures.average().roundToInt()
    val averageNightTemp = nightTemperatures.average().roundToInt()

    println("Средняя дневная температура за месяц: $averageDayTemp°C")
    println("Средняя ночная температура за месяц: $averageNightTemp°C")
    println("Количество дней с осадками за месяц: $precipitationDays")
}



//Продолжи усовершенствовать программу, теперь она должна рассчитывать средние значения температур и считать количество дней с осадками за месяц.
//
//Представь, что данные ты получаешь от датчиков. Сымитируй их поведение с помощью random.
//
//- в функции main() создай список и добавь в него с помощью цикла 30 объектов класса, передав в конструкторы случайные значения;
//- сохрани в отдельные списки дневные и ночные температуры, а также список дней с осадками;
//- вычисли средние значения дневных и ночных температур с помощью специальной extension-функции из стандартной библиотеки;
//- посчитай количество дней с осадками.
//
//Выведи результаты в консоль.