fun main() {
    val array = IntArray(100) { (0..100).random() }
    val groups = Array(10) { IntArray(10) }
    for (i in 0 until 100) {
        groups[i / 10][i % 10] = array[i]
    }
    for (i in 0 until 10) {
        println("Группа ${i + 1}: ${groups[i].contentToString()}")
    }
}