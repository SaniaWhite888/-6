fun main() {
    println("Введите количество элементов массива:")
    val size = readLine()!!.toInt()
    println("Введите элементы массива:")
    val array = IntArray(size)
    for (i in 0 until size) {
        array[i] = readLine()!!.toInt()
    }
    println("Массив: ${array.contentToString()}")
}