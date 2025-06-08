package Day2

data class CoffeeBean(val name: String, val roastLevel: String)Add commentMore actions

fun main() {
    val beans = listOf(
        CoffeeBean("Arabica", "Medium"),
        CoffeeBean("Robusta", "Dark")
    )
    beans.forEach { println("${it.name} - ${it.roastLevel}") }
}