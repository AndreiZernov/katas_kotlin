package _001_game_of_three

class GameOfThree {
    fun play(number: Int): List<Int> {
        val result = mutableListOf<Int>()
        var current = number
        while (current != 1) {
            result.add(current)
            if (current % 3 == 0) current /= 3 else if (current % 3 == 1) current-- else current++
        }
        result.add(1)
        return result
    }
}