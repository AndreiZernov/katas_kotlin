package _002_rotate_a_list

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class RotateAListTest {
    @Test
    fun rotateOnce() = testWrapper(1, listOf(2, 3, 4, 5, 6, 1))

    @Test
    fun rotateTwice() = testWrapper(2, listOf(3, 4, 5, 6, 1, 2))

    @Test
    fun rotate3times() = testWrapper(3, listOf(4, 5, 6, 1, 2, 3))

    @Test
    fun rotate8times() = testWrapper(4, listOf(5, 6, 1, 2, 3, 4))
}

internal fun testWrapper(number: Int, expected: List<Number>) {
    val rotateAList = RotateAList()
    val list = mutableListOf<Int>(1, 2, 3, 4, 5, 6)
    val result = rotateAList.trigger(list, number)
    assertEquals(expected, result)
}
