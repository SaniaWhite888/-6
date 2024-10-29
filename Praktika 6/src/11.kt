fun findIntersection(arr1: IntArray, arr2: IntArray): IntArray {
    val intersection = mutableListOf<Int>()
    for (element in arr1) {
        if (element in arr2) {
            intersection.add(element)
        }
    }
    return intersection.toIntArray()
}

fun main() {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(3, 5, 7, 9)
    val intersection = findIntersection(array1, array2)
    println("Пересечение: ${intersection.joinToString(", ")}")
}