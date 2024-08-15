package constructor_init

class WeatherInCelsius(
    dayTempInKelvin: Int,
    nightTempInKelvin: Int,
    val hasPrecipitation: Boolean,
) {
    val dayTemperature: Int
    val nightTemperature: Int

    init {
        dayTemperature = dayTempInKelvin - 273
        nightTemperature = nightTempInKelvin - 273
    }

    fun printWeatherInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: ${if (hasPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weather = WeatherInCelsius(
        dayTempInKelvin = 295,
        nightTempInKelvin = 285,
        hasPrecipitation = true
    )

    weather.printWeatherInfo()
}



//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//
//- в этой задаче используй первичный конструктор без выделения памяти под свойства;
//- поля должны быть объявлены и проинициализированы в теле класса;
//- все поля с температурой должны иметь тип Int;
//- программа не должна иметь других функций, кроме метода вывода информации о погоде.
//
//В конструктор передается температура в Кельвинах. При обращении к полям с температурой возвращаются данные в Цельсиях.
//
//Cоздай объект с произвольными данными и выведи в консоль методом созданного класса.