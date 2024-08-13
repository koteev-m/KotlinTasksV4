package classes_ptoprties

class RecipeCategory(
    val name: String,
)

class Ingredient(
    val name: String,
    val quantity: String,
)

class Recipe(
    val name: String,
    val numberOfServings: Int,
    val ingredients: List<Ingredient>,
    val instruction: String,
)



//Дизайнер предоставил макет Android-приложения:
//https://www.figma.com/file/89K5JomHGyIkUFUaBKRBXi/RecipesApp?type=design&node-id=1%3A181&mode=design&t=DsOaqqRfAeCTY2eN-1
//
//Для представленных экранов спроектируй следующие сущности для хранения данных:
//
//- Категория рецепта
//- Рецепт
//- Ингредиент