package constructor_init

class DailyWeather(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val hasPrecipitation: Boolean,
) {
    fun printWeatherInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: ${if (hasPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weather = DailyWeather(
        dayTemperature = 15,
        nightTemperature = 12,
        hasPrecipitation = true
    )

    weather.printWeatherInfo()
}







//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//
//- перепиши его, используя определение свойств в основном конструкторе;
//- свойства не должны содержать значения по умолчанию (мы создаем каркас сущности для будущих объектов).
//
//Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.