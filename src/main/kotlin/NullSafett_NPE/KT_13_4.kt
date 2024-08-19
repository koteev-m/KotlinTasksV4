package NullSafett_NPE

class Contact4(
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
    val phoneBook = mutableListOf<Contact4>()

    while (true) {
        println("Введите имя:")
        val name = readln().trim()
        if (name.isEmpty()) break

        println("Введите номер телефона:")
        val phoneNumber = readln().trim().toLongOrNull()
        if (phoneNumber == null) {
            println("Введите номер телефона или контакт не будет добавлен:")
            continue
        }

        println("Введите название компании:")
        var company = readln().trim()
        if (company.isEmpty()) {
            company = null.toString()
        }

        val contact = Contact4(name, phoneNumber, company)
        phoneBook.add(contact)
    }

    phoneBook.forEach { it.printContactInfo() }
}





//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//
//Программа должна заполнять контакты в телефонную книгу (отдельный список объектов).
//
//- если пользователь не ввел номер телефона, то нужно уведомить об этом пользователя и такая запись не должна добавляться;
//- для приведения введенного номера к числу используй toLongOrNull();
//- если пользователь не заполнил компанию, то в объект записывать null.
//
//Выведи созданные объекты в консоль методом класса.