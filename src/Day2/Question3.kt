package Day2

data class CoffeeOrder(val type: String, val size: String)Add commentMore actions

fun main() {
    val order = CoffeeOrder("Latte", "Medium")
    println("Order Summary: ${order.type}, Size: ${order.size}")
}