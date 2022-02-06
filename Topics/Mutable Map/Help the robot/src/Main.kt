fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>) : MutableMap<String, Int> {
    val result = purchases.toMutableMap()
    for (pair in addition) {
        if (purchases.containsKey(pair.key)) {
            result[pair.key] = purchases[pair.key]!! + pair.value
        } else result[pair.key] = pair.value
    }
    return result
}