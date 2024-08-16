package NullSafett_NPE

class Contact5(
    val name: String,
    val phoneNumber: Long,
    val company: String?
) {
    fun printContactInfo(){
        val companyInfo = company ?: "<не указано>"
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: $companyInfo")
    }
}

fun main() {
    println("Введите имя:")
    val nameInput = readln().trim()

    println("Введите номер телефона:")
    val phoneNumberInput = readln().trim()

    try {
        val phoneNumber = phoneNumberInput.toLong()
        println("Введите название компании:")
        val companyInput = readln().trim().ifEmpty { null }

        val contact = Contact5(nameInput, phoneNumber, companyInput)
        contact.printContactInfo()
    }
    catch (e: NumberFormatException) {
        println("Номер телефона введен некорректно!")
    }
}





//Скопируй класс из предыдущей задачи (без логики заполнения телефонной книги) и измени его название для избегания конфликтов.
//
//Для получения номера программа считывает ввод пользователя с типом String по умолчанию. Приведи строку к типу Long.
//Если пользователь ввел что-либо, кроме цифр — программа падает.
//
//Необходимо избежать падения программы при попытке приведения строки к типу Long. Отлови ошибку и выведи ее название в консоль.