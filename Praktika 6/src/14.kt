fun main() {
    val numbers = intArrayOf(1, 3, 6, 9, 12, 15, 18)
    val divisibleBy3 = numbers.filter { it % 3 == 0 }
    println("Числа, делящиеся на 3: ${divisibleBy3.joinToString(", ")}")
}