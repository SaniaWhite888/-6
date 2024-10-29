fun findMaxSequence(array: IntArray): Pair<Int, Int> {
    if (array.isEmpty()) return Pair(0, 0)
    var currentCount = 1
    var maxCount = 1
    var maxStart = 0
    var currentStart = 0
    for (i in 1 until array.size) {
        if (array[i] == array[i - 1]) {
            currentCount++
            if (currentCount > maxCount) {
                maxCount = currentCount
                maxStart = currentStart
            }
        } else {
            currentCount = 1
            currentStart = i
        }
    }
    return Pair(maxStart, maxStart + maxCount)
}