package NullSafett_NPE

class Contact3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContactInfo(){
        val companyInfo = company ?: "<не указано>"
        println("-Имя: $name\n-Номер: $phoneNumber\n-Компания: $companyInfo")
    }
}

fun main() {
    val contacts = listOf(
        Contact3("Igor", 988979978897, "qwerty"),
        Contact3("Ivan", 36363643, "huerty"),
        Contact3("Maksim", 366346346),
        Contact3("Vova", 988979978897),
        Contact3("Ula", 988979978897, "null"),
    )
    println("Список компаний:")
    contacts
        .mapNotNull { it.company }
        .filter { it != "<не указано>" }
        .distinct()
        .forEach { println(it) }

}




//Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.
//
//Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.
//
//- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
//- 2 контакта должны принимать null для поля компании;
//- 1 контакт должен иметь название компании “null”;
//- выведи список всех существующих компаний, которые есть в телефонной книге.