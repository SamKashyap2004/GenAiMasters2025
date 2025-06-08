package Day2

fun isValidCoffeeType(type: String?): Boolean {Add commentMore actions
    val validTypes = listOf("Latte", "Espresso", "Mocha", "Cappuccino")
    return type != null && type in validTypes
}
fun main() {
    println(isValidCoffeeType("Mocha"))
    println(isValidCoffeeType(null))
}