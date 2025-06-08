package Day2

data class CoffeeMenu(val items: List<String>) {Add commentMore actions
    fun printMenu() {
        items.forEach { println(it) }
    }
}
fun main() {
    val menu = CoffeeMenu(listOf("Latte", "Mocha", "Espresso"))
    menu.printMenu()
}