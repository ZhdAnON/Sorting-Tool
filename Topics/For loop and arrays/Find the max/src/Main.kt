fun main() {
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }

    for (i in numbers.indices) {
        if (numbers[i] == numbers.maxOrNull()) {
            println(i)
            break
        }
    }
}