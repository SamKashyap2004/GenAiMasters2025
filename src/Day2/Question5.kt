package Day2

class CoffeeShop(val name: String) {Add commentMore actions
    fun printOpeningHours() {
        println("$name is open from 8 AM to 8 PM.")
    }
}

fun main() {
    val shop = CoffeeShop("BrewBuzz")
    shop.printOpeningHours()
}