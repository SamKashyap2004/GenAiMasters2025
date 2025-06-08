package Day2

fun welcomeCoffee(coffeeType: String): String {Add commentMore actions
    return "Enjoy your $coffeeType!"
}

fun main() {
    val message = welcomeCoffee("Latte")
    println(message)
}