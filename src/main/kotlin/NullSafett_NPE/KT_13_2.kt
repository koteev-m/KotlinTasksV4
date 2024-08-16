package NullSafett_NPE

class Contact2(
    private val name: String,
    private val phoneNumber: Long,
    private val company: String? = null
) {
    fun printContactInfo(){
        val companyInfo = company ?: "<не указано>"
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: $companyInfo")
    }
}

fun main() {
    val contact1 = Contact2("Maksim", 79887696785, "qwerty")
    contact1.printContactInfo()

    val contact2 = Contact2("Ivan", 6788678687867)
    contact2.printContactInfo()
}





//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//
//На его основе создай экземпляр. Для поля с названием компании значение по умолчанию должно быть null.
//
//Дополни класс методом, который будет печатать информацию о контакте сообщением в одном println() и без использования многострочного ввода такого типа (пример):
//
//- Имя: Ростислав
//- Номер: 89123456789
//- Компания: Reddit
//
//Вместо null значения, в консоль должна выводиться строка <не указано>.