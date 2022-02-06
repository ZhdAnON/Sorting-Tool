fun main() {
    //Do not touch code below
    var inputArray: Array<Array<String>> = arrayOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val strings = readLine()!!.split(' ').toTypedArray()
        inputArray += strings
    }

    val newArray: Array<Array<String>> = arrayOf(inputArray.last(), inputArray.first())
    println(newArray.contentDeepToString())
}