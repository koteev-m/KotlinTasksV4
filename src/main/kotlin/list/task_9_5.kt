package list

fun main() {
    val ingredients = mutableListOf<String>()

    while (ingredients.size < 5) {
        println("Введите название ингредиента:")
        val inputIngredients = readln().trim().lowercase()
        if (inputIngredients.isNotEmpty()) {
            ingredients.add(inputIngredients)
        }
    }

    val sortedIngredients = ingredients.toList().sorted()

    if (sortedIngredients.isNotEmpty()) {
        sortedIngredients[0].replaceFirstChar { it.uppercase() }
    }

    println(sortedIngredients.joinToString(", "))
}





//Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).
//- результат должен исключать повторы;
//- список должен выводиться в алфавитном порядке;
//- все элементы списка выведены в одну строку, разделяя слова запятыми;
//- первый элемент должен быть распечатан с заглавной буквы.