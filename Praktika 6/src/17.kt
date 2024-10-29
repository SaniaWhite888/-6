fun calculateSumAndProduct(arr: IntArray): Pair<Int, Int> {
    var sum = 0
    var product = 1
    for (element in arr) {
        sum += element
        product = element
    }
    return Pair(sum, product)
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val (sum, product) = calculateSumAndProduct(array)
    println("Сумма: $sum, Произведение: $product")
}