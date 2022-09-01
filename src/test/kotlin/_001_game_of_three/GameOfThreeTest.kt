package _001_game_of_three

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class GameOfThreeTest {
    @Test
    fun test3() = testWrapper(3, listOf(3, 1))

    @Test
    fun test100() = testWrapper(100, listOf(100, 99, 33, 11, 12, 4, 3, 1))
}

internal fun testWrapper(number: Int, expected: List<Number>) {
    val gameOfThree = GameOfThree()
    val actual = gameOfThree.play(number)
    assertEquals(expected, actual)
}
