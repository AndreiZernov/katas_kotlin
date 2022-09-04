package _003_square_of_root

import kotlin.math.round
import kotlin.math.sqrt

class SquareOfRoot {
    fun run(numbers: List<Int>) = numbers.map {
        val square = sqrt(it.toDouble())
        if (square == round(square)) square.toInt() else it * it
    }
}