package classes_ptoprties

fun main() {
    val user1 = User(
        id = 1,
        login = "QQ",
        password = "qwerty",
        email = "qq@gmail.com"
    )

    val user2 = User(
        id = 2,
        login = "BB",
        password = "1234",
        email = "bb@gmail.com"
    )

    user1.printInfo()
    user2.printInfo()
}



class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {
    fun printInfo() {
        println("ID: $id")
        println("Login: $login")
        println("Password: $password")
        println("Email: $email")
    }
}




//Задача 1 к Уроку 11
//
//Создай класс, который будет хранить данные пользователя. В свойствах должна храниться информация об уникальном идентификаторе,
// логине, пароле и почте. Названием может быть, например, User. Создай два экземпляра класса с произвольными данными и выведи в консоль содержимое их полей.