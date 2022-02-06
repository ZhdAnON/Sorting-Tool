    val lambda: (Long, Long) -> Long = { a: Long, b: Long ->
        var result = 1L
        for (i in a..b) result *= i
        result
    }