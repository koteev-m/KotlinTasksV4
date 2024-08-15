package constructor_init

class WeatherInCelsius2(
    dayTempInKelvin: Int,
    nightTempInKelvin: Int,
    val hasPrecipitation: Boolean,
) {
    val dayTemperature: Int
    val nightTemperature: Int

    init {
        dayTemperature = dayTempInKelvin - 273
        nightTemperature = nightTempInKelvin - 273

        printWeatherInfo()
    }

    fun printWeatherInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: ${if (hasPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weather = WeatherInCelsius2(
        dayTempInKelvin = 295,
        nightTempInKelvin = 285,
        hasPrecipitation = true
    )
}


//Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.