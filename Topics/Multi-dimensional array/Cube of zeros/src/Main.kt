fun main() {
    val array = Array(3) { Array(3) { IntArray(3) { 0 } } }
    println(array.contentDeepToString())
}