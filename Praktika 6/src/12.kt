fun swapElements(arr: IntArray, index1: Int, index2: Int) {
    val temp = arr[index1]
    arr[index1] = arr[index2]
    arr[index2] = temp
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    swapElements(array, 1, 3)
    println("Переставленный массив: ${array.joinToString(", ")}")
}