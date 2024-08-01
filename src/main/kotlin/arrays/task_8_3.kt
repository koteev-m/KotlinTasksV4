package arrays

fun main() {
    val ingredients = arrayOf("помидор", "огурец", "соль", "укроп", "баклажан", "тимьян", "оливковое масло")

    val inputIngredient = readln()

    if (ingredients.contains(inputIngredient)){
        println("Ингредиент $inputIngredient в рецепте есть")
    }
    else{
        println("Такого ингредиента в списке нет")
    }
}



//Используй условие из предыдущей задачи. Нужно доработать код, который проверяет наличие ингредиента в рецепте.
//Однако, не используя цикл для поиска.