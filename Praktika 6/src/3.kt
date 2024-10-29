fun main() {
    val numbers = intArrayOf(5, 1, 8, 3, 9, 2, 7, 4, 10, 6)
    var max = numbers[0]
    var min = numbers[0]

    for (number in numbers) {
        if (number > max) {
            max = number
        }
        if (number < min) {
            min = number
        }
    }

    println("Максимальное значение: $max")
    println("Минимальное значение: $min")
}