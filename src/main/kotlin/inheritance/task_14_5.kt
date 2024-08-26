package inheritance

open class Message(
    val id: Int,
    val author: String,
    val text: String,
) {
    override fun toString(): String {
        return "[$id] $author: $text"
    }
}

class ChildMessage(
    id: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(id, author, text) {
    override fun toString(): String {
        return "\t[$id] $author: $text"
    }
}

class Chat{
    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(author: String, text: String) {
        val message = Message(nextId++, author, text)
        messages.add(message)
    }

    fun addThreadMessage(parentMessageId: Int, author: String, text: String) {
        val parentMessage = messages.find { it.id == parentMessageId }
        if (parentMessage != null) {
            val childMessage = ChildMessage(nextId++, author, text, parentMessageId)
            messages.add(childMessage)
        }
        else {
            println("Сщщбщение с id $parentMessageId не найдено")
        }
    }

    fun printChat() {
        val groupedMessages = messages.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }

        groupedMessages.forEach { (parentId, messageList) ->
            val parentMessage = messages.find { it.id == parentId }
            parentMessage?.let {
                println(it)
                messageList.filterIsInstance<ChildMessage>().forEach { child ->
                    println(child)
                }
            }
        }
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("Maksim", "Hello, everyone!")
    chat.addMessage("Ivan", "Hi, Maksim!")

    chat.addThreadMessage(1, "Svetlana", "Welcome, Maksim!")
    chat.addThreadMessage(1, "Petr", "Hi, Maksim and Svetlana!")

    chat.addMessage("Vova", "Good morning!")
    
    chat.printChat()
}









//Создай класс Chat, который реализует обсуждение в мессенджере, аналогичному Discord. Класс должен иметь следующие методы:
//
//- addMessage() — добавляет обычное сообщение в чат, принимает на вход текст и автора сообщения;
//- addThreadMessage() — добавляет сообщение в тред к предыдущему сообщению (для начала обсуждения), дополнительно
//принимает на вход parentMessageId для идентификации сообщения, под которым создается ветка обсуждения;
//
//Сообщения чата должны храниться в списке, в классе Chat. Для создания сообщений соответствующих типов используй
//классы Message и ChildMessage в соответствующей иерархии. У каждого типа сообщения должен быть id.
//
//- printChat() — печатает все сообщения чата. Если создано дочернее сообщение, необходимо применить для вывода
//табуляцию и печатать его под родительским сообщением. Используй groupBy() для группировки сообщений по parentMessageId,
//если сообщение является экземпляром ChildMessage, или по id если это обычное сообщение.