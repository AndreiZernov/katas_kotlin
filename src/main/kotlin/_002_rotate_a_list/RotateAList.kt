package _002_rotate_a_list

class RotateAList {
    fun trigger(list: MutableList<Int>, number: Int): List<Int> {
        if (list.isEmpty()) return list
        for (i in 1..number) {
            val first = list.first()
            list.add(list.size, first)
            list.removeAt(0)
        }
        return list
    }
}