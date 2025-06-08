package Day2

fun filterCoffeeStartingWithC(coffeeList: List<String>): List<String> {Add commentMore actions
    return coffeeList.filter { it.startsWith("C") }
}

fun main() {
    val types = listOf("Espresso", "Americano", "Cappuccino", "Latte", "Macchiato", "Mocha", "Flat White", "Ristretto", "Affogato", "Cold Brew", "Nitro Coffee", "Turkish Coffee", "French Press Coffee", "Drip Coffee")
    println(filterCoffeeStartingWithC(types))
}