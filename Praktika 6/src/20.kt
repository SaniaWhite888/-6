fun main() {
    // Определение параметров арифметической прогрессии
    val firstTerm = 1 // Первый член
    val commonDifference = 3 // Разность
    val numberOfTerms = 10 // Количество членов

    // Создание массива для хранения прогрессии
    val arithmeticProgression = IntArray(numberOfTerms) {
        // Вычисление каждого члена прогрессии
        firstTerm + it
    }

    // Вывод массива
    println("Арифметическая прогрессия: ${arithmeticProgression.joinToString(", ")}")
}