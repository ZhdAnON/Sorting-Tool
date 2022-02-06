import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    val numbers = IntArray(scanner.nextInt()) { scanner.nextInt() }
    val numberP = scanner.nextInt()
    val numberM = scanner.nextInt()

    println(if (numbers.contains(numberP) && numbers.contains(numberM)) "YES" else "NO")
}