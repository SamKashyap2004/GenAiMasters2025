package Day2

fun countUniqueOrders(orders: Set<String>) {Add commentMore actions
    println("Unique orders: ${orders.size}")
}
fun main() {
    val orders = setOf("Latte", "Espresso", "Latte")
    countUniqueOrders(orders)
}