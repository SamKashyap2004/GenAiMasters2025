package Day2

fun calculateTotal(quantity: Int, pricePerCup: Double?): Double {Add commentMore actions
    return quantity * (pricePerCup ?: 3.0)
}

fun main() {
    val total = calculateTotal(3, null)
    println("Total price: ₹$total")
}