package _004_merge_list

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MergeListTest {
    @Test
    fun test1() = testWrapper(listOf(1, 2, 3, 4, 5), listOf(6, 7, 8, 9, 10), listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

    @Test
    fun test2() = testWrapper(listOf(1, 4, 6), listOf(2, 3, 5), listOf(1, 2, 3, 4, 5, 6))
}

internal fun testWrapper(list1: List<Int>, list2: List<Int>, expected: List<Number>) {
    val mergeList = MergeList()
    val actual = mergeList.merge(list1, list2)
    assertEquals(expected, actual)
}