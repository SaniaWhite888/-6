fun isPalindrome(arr: IntArray): Boolean {
    val reversed = arr.reversedArray()
    return arr.contentEquals(reversed)
}

fun main() {
    val array = intArrayOf(1, 2, 3, 2, 1)
    val isPalindrome = isPalindrome(array)
    println("Массив палиндром: $isPalindrome")
}