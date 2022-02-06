fun summator(map: Map<Int, Int>): Int {
    return map.entries.filter { it.key % 2 == 0 }.sumOf { it.value }
}