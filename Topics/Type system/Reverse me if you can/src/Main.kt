fun reverse(input: Int?): Int {
    return if (input == null) -1
    else {
        val temp = input.toString()
        var result = ""
        for (i in temp.indices) {
            result += temp[temp.lastIndex - i]
        }
        return result.toInt()
    }
}