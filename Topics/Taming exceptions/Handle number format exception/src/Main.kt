import java.lang.Exception

fun parseCardNumber(cardNumber: String): Long {
    val numberSize = cardNumber.split(" ")
    val validNumber = numberSize.size == 4 && numberSize.filter { it.length == 4 }.size == 4
    return if (validNumber) numberSize.joinToString("").toLong()
    else throw Exception("Неверный номер карты")
}
