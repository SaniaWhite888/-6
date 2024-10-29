fun average(array: IntArray): Double {
    if (array.isEmpty()) return 0.0
    val sum = array.sum()
    return sum.toDouble() / array.size
}