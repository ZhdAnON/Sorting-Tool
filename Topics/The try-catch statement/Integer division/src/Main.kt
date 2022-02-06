fun intDivision(x: String, y: String): Int {
    val result = 0
    return try {
        x.toInt() / y.toInt()
    } catch (e: NumberFormatException) {
        println("Read values are not integers.")
        result
    } catch (e: ArithmeticException) {
        println("Exception: division by zero!")
        result
    }
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))
}