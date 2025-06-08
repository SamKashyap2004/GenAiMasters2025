package Day2

fun firstAlphabeticalCoffee(coffees: List<String>) {Add commentMore actions
    val sorted = coffees.sorted()
    println("First alphabetically: ${sorted.firstOrNull()}")
}
fun main() {
    val list = listOf("Mocha", "Espresso", "Latte", "Cappuccino")
    firstAlphabeticalCoffee(list)
}