fun sumRecursive(n: Int): Int {
    return if (n != 1) n + sumRecursive(n-1) else 1
}

fun main() {
    val n = readLine()!!.toInt()
    print(sumRecursive(n))
}