package inheritance

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}


fun main() {
    val figures = listOf(
        Circle("black", 5.0),
        Circle("white", 3.0),
        Rectangle("black", 4.0, 6.0),
        Rectangle("white", 2.0, 8.0),
    )

    val blackPerimeterSum = figures
        .filter { it.color == "black" }
        .sumOf { it.perimeter() }

    val whiteAreaSum = figures
        .filter { it.color == "white" }
        .sumOf { it.area() }

    println("Сумма периметров черных фигур: $blackPerimeterSum")
    println("Сумма площадей всех белых фигур: $whiteAreaSum")
}