fun mergeSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    val mergedArray = mutableListOf<Int>()
    var i = 0
    var j = 0
    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] <= arr2[j]) {
            mergedArray.add(arr1[i])
            i++
        } else {
            mergedArray.add(arr2[j])
            j++
        }
    }
    while (i < arr1.size) {
        mergedArray.add(arr1[i])
        i++
    }
    while (j < arr2.size) {
        mergedArray.add(arr2[j])
        j++
    }
    return mergedArray.toIntArray()
}

fun main() {
    val array1 = intArrayOf(1, 3, 5, 7, 9)
    val array2 = intArrayOf(2, 4, 6, 8, 10)
    val mergedArray = mergeSortedArrays(array1, array2)
    println("Слитый массив: ${mergedArray.joinToString(", ")}")
}