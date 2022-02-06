fun main() {
    val arraySize = readLine()!!.toInt()
    val numbers = IntArray(arraySize)

    for (i in 0..numbers.lastIndex) {
        numbers[i] = readLine()!!.toInt()
    }

    var count = 0
    for (i in 0..numbers.lastIndex - 2) {
        if (numbers[i] + 1 == numbers[i + 1] && numbers[i] + 2 == numbers[i + 2]) {
            count++
        }
    }
    println(count)
}