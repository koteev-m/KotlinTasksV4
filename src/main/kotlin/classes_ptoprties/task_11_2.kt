package classes_ptoprties

fun main() {
    val user = User2(
        id = 3,
        login = "qwerty12",
        password = "12442",
        email = "1244@gmail.com",
    )
    
    user.printInfo()
    user.setBio()
    user.changePassword()

}



class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun printInfo() {
        println("ID: $id")
        println("Login: $login")
        println("Password: $password")
        println("Email: $email")
        println("Bio: $bio")
    }
    
    fun setBio() {
        println("Расскажите о себе:")
        bio = readln()
    }
    
    fun changePassword() {
        println("Введите пароль:")
        val currentPassword = readln()
        
        if (currentPassword == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен.")
        }
        else {
            println("Неверный пароль")
        }
    }
}



//Скопируй класс User из первой задачи и назови User2. Добавь к классу новое необязательное свойство bio и несколько методов:
//
//- вывод информации о пользователе в консоль;
//- считывание из консоли текста и запись в поле bio;
//- изменение пароля — сначала запросить текущий пароль, и, если он введен верно, запросить новый. Записать его в поле и сообщить, что пароль изменен;
//
//Далее создай объект, заполни информацию “о себе” и замени пароль. В конце выведи обновленную информацию о пользователе.