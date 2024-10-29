fun main() {
    val randomNumbers = IntArray(20) { (1..100).random() }
    println("Случайные числа: ${randomNumbers.joinToString(", ")}")
}