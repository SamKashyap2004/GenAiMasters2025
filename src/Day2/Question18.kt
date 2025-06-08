package Day2

fun mostExpensiveCoffee(prices: Map<String, Double>): String {Add commentMore actions
    return prices.maxByOrNull { it.value }?.key ?: "No coffee found"
}
fun main() {
    val coffeePrices = mapOf("Latte" to 120.0, "Espresso" to 100.0, "Mocha" to 150.0)
    println("Most expensive: ${mostExpensiveCoffee(coffeePrices)}")
}