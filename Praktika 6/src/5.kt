fun main() {
    val numbers = intArrayOf(1, 2, 2, 3, 4, 4, 5, 5, 6)
    val uniqueNumbers = numbers.distinct().toTypedArray() // Удаление дубликатов

    println("Уникальные элементы: ${uniqueNumbers.joinToString(", ")}")
}