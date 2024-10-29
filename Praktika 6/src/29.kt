fun findMedian(array: IntArray): Double {
    val sortedArray = array.sortedArray()
    val mid = sortedArray.size / 2
    return if (sortedArray.size % 2 == 0) {
        (sortedArray[mid - 1] + sortedArray[mid]).toDouble() / 2
    } else {
        sortedArray[mid].toDouble()
    }
}