fun main() {
    val numbers = intArrayOf(5, 1, 8, 3, 9, 2, 7, 4, 10, 6)
    numbers.sort() // Сортировка по возрастанию

    println("Отсортированный массив: ${numbers.joinToString(", ")}")
}