package Day2

fun highestPrice(prices: List<Double>): Double? {Add commentMore actions
    return prices.maxOrNull()
}

fun main() {
    val prices = listOf(120.0, 150.0, 90.0)
    println("Highest price: ₹${highestPrice(prices)}")
}