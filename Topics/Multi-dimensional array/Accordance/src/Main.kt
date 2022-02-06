fun main() {
    val indicesArray = Array(2) { Array(3) { " " } }

    for (i in indicesArray.indices) {
        for (j in indicesArray[i].indices) {
            indicesArray[i][j] = "[$i][$j]"
        }
    }

    println(indicesArray.contentDeepToString())
}