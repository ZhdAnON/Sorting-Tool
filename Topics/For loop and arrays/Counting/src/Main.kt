fun main() {
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val numberM = readLine()!!.toInt()

    var result = 0
    for (number in numbers) {
        if (number == numberM) result ++
    }
    println(result)
}