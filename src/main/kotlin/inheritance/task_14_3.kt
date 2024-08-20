package inheritance

import kotlin.math.*

const val BLACK = "black"
const val WHITE = "white"

abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun area(): Double {
        return PI * radius.pow(2)
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
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
        Circle(BLACK, 5.0),
        Circle(WHITE, 3.0),
        Rectangle(BLACK, 4.0, 6.0),
        Rectangle(WHITE, 2.0, 8.0),
    )

    val blackPerimeterSum = figures
        .filter { it.color == BLACK }
        .sumOf { it.perimeter() }

    val whiteAreaSum = figures
        .filter { it.color == WHITE }
        .sumOf { it.area() }

    println("Сумма периметров черных фигур: $blackPerimeterSum")
    println("Сумма площадей всех белых фигур: $whiteAreaSum")
}