fun main() {
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    println(if (numbers.contains(readLine()!!.toInt())) "YES" else "NO")
}