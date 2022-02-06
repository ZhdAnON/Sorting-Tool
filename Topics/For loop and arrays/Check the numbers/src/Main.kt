fun main() {
    val numbers = IntArray(readLine()!!.toInt()) { readLine()!!.toInt() }
    val (numberP, numberM) = readLine()!!.split(" ")

    var result = false

    for (i in numbers.indices) {
        when (i) {
            0 -> {
                if (numbers[i] == numberM.toInt() && numbers[1] == numberP.toInt() ||
                    numbers[i] == numberP.toInt() && numbers[1] == numberM.toInt()
                ) {
                    result = true
                    break
                }
            }
            numbers.lastIndex -> {
                if (numbers[i] == numberM.toInt() && numbers[i - 1] == numberP.toInt() ||
                    numbers[i] == numberP.toInt() && numbers[i - 1] == numberM.toInt()
                ) {
                    result = true
                    break
                }
            }
            else -> {
                if (numbers[i] == numberP.toInt()) {
                    if (numbers[i - 1] == numberM.toInt() || numbers[i + 1] == numberM.toInt()) {
                        result = true
                        break
                    }
                }
                if (numbers[i] == numberM.toInt()) {
                    if (numbers[i - 1] == numberP.toInt() || numbers[i + 1] == numberP.toInt()) {
                        result = true
                        break
                    }
                }
            }
        }
    }

    println(if (result) "NO" else "YES")
}