fun removeElement(array: IntArray, element: Int): IntArray {
    val newArray = array.filter { it != element }.toIntArray()
    return newArray
}