fun findSecondMax(array: IntArray): Int? {
    if (array.size < 2) return null
    var max = array[0]
    var secondMax = Int.MIN_VALUE
    for (i in 1 until array.size) {
        if (array[i] > max) {
            secondMax = max
            max = array[i]
        } else if (array[i] > secondMax && array[i] != max) {
            secondMax = array[i]
        }
    }
    if (secondMax == Int.MIN_VALUE) return null
    return secondMax
}