fun main() {
    val studentsMarks = mutableMapOf<String, Int>()

    val keys = mutableListOf<String>()
    val values = mutableListOf<Int>()

    var isKey = true
    while (true) {
        val temp = readLine()!!
        when {
            temp == "stop" -> break
            isKey -> keys.add(temp)
            !isKey -> values.add(temp.toInt())
        }
        isKey = !isKey
    }
    if (keys.size == values.size) {
        for (i in 0 until keys.size) {
            if (!studentsMarks.containsKey(keys[i])) studentsMarks[keys[i]] = values[i]
        }
    }

    println(studentsMarks)
}