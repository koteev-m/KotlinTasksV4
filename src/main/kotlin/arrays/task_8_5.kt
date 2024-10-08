package arrays

fun main() {
    println("Введите колличество ингредиентов:")
    val numIngredients = readln().toInt()

    val ingredients = Array(numIngredients) {""}

    for (i in 0..<numIngredients){
        println("Введите ингредиент ${i + 1}")
        ingredients[i] = readln()
    }

    println("Полученные ингредиенты: ${ingredients.joinToString (", " )}")
}


//Напиши программу, которая должна создавать массив из определенного количества ингредиентов, которые будет вводить пользователь.
//
//- элементы вводятся по одному;
//- перед вводом элементов сначала запрашивается количество планируемых ингредиентов;
//- запрещено использовать список или динамический массив.
//
//Выведи полученные ингредиенты в консоль через запятую.