package _003_square_of_root

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SquareOfRootTest {
    @Test
    fun test1() = testWrapper(listOf(4, 1), listOf(2, 1))

    @Test
    fun test2() = testWrapper(listOf(4, 3, 9, 7, 2, 1), listOf(2, 9, 3, 49, 4, 1))

    @Test
    fun test3() = testWrapper(listOf(1, 4, 9, 5, 4, 1), listOf(1, 2, 3, 25, 2, 1))
}

internal fun testWrapper(numbers: List<Int>, expected: List<Int>) {
    val squareOfRoot = SquareOfRoot()
    val actual = squareOfRoot.run(numbers)
    assertEquals(expected, actual)
}