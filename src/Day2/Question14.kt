package Day2

fun applyDiscount(prices: List<Double>): List<Double> {Add commentMore actions
    return prices.map { it * 0.9 }
}

fun main() {
    val prices = listOf(100.0, 200.0, 150.0)
    println("Discounted prices: ${applyDiscount(prices)}")
}