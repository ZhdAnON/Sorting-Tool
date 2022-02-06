fun main() {
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val shift = readLine()!!.toInt()

    repeat(shift % numbers.size) {
        val temp = numbers[numbers.lastIndex]
        for (i in numbers.lastIndex downTo 1) {
            numbers[i] = numbers[i - 1]
        }
        numbers[0] = temp
    }
    println(numbers.joinToString(" "))
}