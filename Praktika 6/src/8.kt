fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val searchElement = 3
    val index = numbers.indexOf(searchElement)

    if (index != -1) {
        println("Элемент $searchElement найден по индексу: $index")
    } else {
        println("Элемент $searchElement не найден в массиве")
    }
}