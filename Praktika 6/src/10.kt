fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var sumEven = 0

    for (number in numbers) {
        if (number % 2 == 0) {
            sumEven += number
        }
    }

    println("Сумма четных чисел: $sumEven")
}