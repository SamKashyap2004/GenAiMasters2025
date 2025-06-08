package Day2

data class Barista(val name: String, val favoriteCoffee: String?)Add commentMore actions

fun main() {
    val barista = Barista("Arya", null)
    println("${barista.name}'s favorite: ${barista.favoriteCoffee ?: "None"}")
}