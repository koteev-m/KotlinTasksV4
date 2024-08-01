package list

fun main() {
    val ingredients = listOf("помидор", "огурец", "соль", "укроп", "баклажан", "тимьян", "оливковое масло")

    println("В рецепте есть следующие ингредиенты:")
    for (ingredient in ingredients){
        println(ingredient)
    }
}



//Продолжи разработку приложения с рецептами, но с реализацией через список. Создай список ингредиентов блюда в виде списка, инициализируй любыми значениями.
//
//– выведи в консоль сообщение: "В рецепте есть следующие ингредиенты: [список_ингредиентов]";
//– выведи все ингредиенты, каждый с новой строки.