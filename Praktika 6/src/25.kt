fun linearSearch(array: IntArray, element: Int): Boolean {
    for (i in array.indices) {
        if (array[i] == element) {
            return true
        }
    }
    return false
}