fun solution(first: Set<Int>, second: Set<Int>): Set<Int> {
    val result = mutableSetOf<Int>()
    for (firstElement in first) {
        if (firstElement % second.size == 0) result.add(firstElement)
    }
    return result.toSet()
}