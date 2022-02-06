fun main() {
    val companyAmount = readLine()!!.toInt()
    val annualIncome = IntArray(companyAmount) { readLine()!!.toInt() }
    val companyInfo = IntArray(companyAmount) { readLine()!!.toInt() }

    var result = 1
    var maxTaxes = annualIncome[0] * companyInfo[0]
    for (i in 1 until companyAmount) {
        if (annualIncome[i] * companyInfo[i] > maxTaxes) {
            result = i + 1
            maxTaxes = annualIncome[i] * companyInfo[i]
        }
    }

    println(result)
}