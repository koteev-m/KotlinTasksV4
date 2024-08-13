package constructor_init

class Weather() {
    var dayTemperature = 0
    var nightTemperature = 0
    var hasPrecipitation = false

    fun printWeatherInfo() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: ${if (hasPrecipitation) "Да" else "Нет"}")
    }
}

fun main() {
    val weatherDay1 = Weather()
    weatherDay1.dayTemperature = 25
    weatherDay1.nightTemperature = 14
    weatherDay1.hasPrecipitation = true

    val weatherDay2 = Weather()
    weatherDay2.dayTemperature = 28
    weatherDay2.nightTemperature = 16
    weatherDay2.hasPrecipitation = false

    println("Погода на первый день:")
    weatherDay1.printWeatherInfo()

    println("Погода на второй день:")
    weatherDay2.printWeatherInfo()
}






//Программа отслеживает погоду по дням. Создай класс для хранения данных о температуре и осадках для одного дня.
//
//Объекты класса будут хранить:
//
//- дневная температура;
//- ночная температура;
//- наличие осадков в течение суток.
//
//Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.
//
//- в классе создай переменные и проинициализируй их какими-нибудь значениями;
//- затем в созданных объектах подставь другие значения этим переменным.
//
//В этой задаче используй пустой конструктор.