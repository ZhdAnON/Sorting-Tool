fun main() {
    try {
        println(readLine()!!.toInt() / readLine()!!.toInt())
    } catch (e: ArithmeticException) {
        println("Division by zero, please fix the second argument!")
    }
}