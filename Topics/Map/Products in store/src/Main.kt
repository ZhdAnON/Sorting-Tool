fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    var result = 0
    shoppingList.forEach {
        if (priceList.containsKey(it)) {
            result += priceList.getValue(it)
        }
    }
    return result
}