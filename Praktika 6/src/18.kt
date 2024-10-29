fun groupNumbers(arr: IntArray, groupSize: Int): List<List<Int>> {
    val groupedNumbers = mutableListOf<List<Int>>()
    for (i in 0 until arr.size step groupSize) {
        val group = arr.slice(i until minOf(i + groupSize, arr.size))
        groupedNumbers.add(group)
    }
    return groupedNumbers
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val groupedNumbers = groupNumbers(array, 5)
    println("Сгруппированные числа: ${groupedNumbers.joinToString("\n") { it.joinToString(", ") }}")
}