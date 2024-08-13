package classes_ptoprties

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Maksim")
    val user2 = forum.createNewUser("Ivan")

    forum.createdNewMessage(user1.userId, "Hi all")
    forum.createdNewMessage(user2.userId, "hi")
    forum.createdNewMessage(user1.userId, "BB")
    forum.createdNewMessage(user2.userId, "BB")

    forum.printTread()
}


class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum{
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()
    private var userIdCounter = 1

    fun createNewUser(userName: String): ForumMember {
        val newUser = ForumMember(userId = userIdCounter++, userName = userName)
        members.add(newUser)
        return newUser
    }

    fun createdNewMessage(authorId: Int, message: String) {
        val authorExist = members.any { it.userId == authorId }
        if (authorExist) {
            messages.add(ForumMessage(authorId, message))
        }
        else {
            println("Пользователь с id $authorId не нейден.")
        }
    }

    fun printTread() {
        for (msg in messages) {
            val authorName = members.find { it.userId == msg.authorId }?.userName ?: "Неизвестный"
            println("$authorName: ${msg.message}")
        }
    }
}









//Реализовать класс работы форума (Forum). Для реализации создай дополнительные классы для сущностей “Член форума”
//(с полями userId и userName) и “Сообщение форума” (с полями authorId и message).
//
//Примени паттерн “Фабрика” для создания пользователей и сообщений форума. Напрямую объекты не создаются, логика должна быть инкапсулирована внутри методов класса.
//
//- createNewUser() создает новых пользователей, принимая имя пользователя. Метод сохраняет нового пользователя в общий список и одновременно возвращает новый объект.
//Генерация id-шников новых пользователей происходит внутри;
//- createNewMessage() создает сообщения, принимая id пользователя. Сообщения создаются только если такой пользователь есть на форуме;
//- printThread() печатает в консоль все сообщения добавленные на форум в формате:
//
//автор: сообщение
//автор: сообщение
//
//Создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей и по два сообщения от каждого пользователя.