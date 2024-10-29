fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val copyNumbers = numbers.copyOf()

    println("Оригинальный массив: ${numbers.joinToString(", ")}")
    println("Скопированный массив: ${copyNumbers.joinToString(", ")}")
}