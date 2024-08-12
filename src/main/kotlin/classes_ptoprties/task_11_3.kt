package classes_ptoprties

fun main() {
    val participant1 = Participant("Ivan", "teacher", "разговаривает")
    val participant2 = Participant("Maksim", "student", "микрофон выключен")
    val participant3 = Participant("Svetlana", "admin", "пользователь заглушен")

    val room = Room("jpg", "Kotlin Basic")

    room.addParticipant(participant1)
    room.addParticipant(participant2)
    room.addParticipant(participant3)

    room.updateParticipantStatus("Maksim" , "разговаривает")

    room.displayRoomInfo()

}


class Participant(
    val nickName: String,
    val avatar: String,
    var status: String,
)

class Room(
    private val coverRoom: String,
    private val titleRoom: String,
) {
    private val participants = mutableListOf<Participant>()

    fun addParticipant(participant: Participant) {
        participants.add(participant)
    }

    fun updateParticipantStatus(nickName: String, newStatus: String) {
        for (participant in participants) {
            if (participant.nickName == nickName) {
                participant.status = newStatus
                break
            }
        }
    }

    fun displayRoomInfo() {
        println(titleRoom)
        println(coverRoom)
        for (participant in participants) {
            println("${participant.nickName} ${participant.avatar} ${participant.status}")
        }
    }

}



//Прокачиваем абстрактное мышление. Задача на проектирование сущностей для упрощенной версии приложения социальной сети,
// в которой общаются только голосом. Требуется описать сущности и имитировать действия методами.
//
//Функционал одного из модулей будет такой. Есть лента, в которой отображаются “комнаты” для общения по интересам. В карточке “комнаты” отображается:
//
//- обложка;
//- название;
//- список участников — отображаются в виде аватарок. При долгом нажатии на аватар подсветится его никнейм. Рядом с аватаркой
// отображается текстовый бейдж с одним из возможных статусов говорящего: “разговаривает”, “микрофон выключен”, “пользователь заглушен”.
//
//Класс должен содержать методы:
//
//– добавления участника (принимает объект участника и сохраняет в свойство комнаты);
//– обновления статуса (принимает имя пользователя и новый статус).
//
//После проектирования создай объект комнаты с произвольными данными.