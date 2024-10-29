fun concatenateArrays(arr1: IntArray, arr2: IntArray): IntArray {
    return arr1 + arr2
}

fun main() {
    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(4, 5, 6)
    val concatenatedArray = concatenateArrays(array1, array2)
    println("Конкатенированный массив: ${concatenatedArray.joinToString(", ")}")
}