package Day2

fun greetCustomer(name: String?): String {Add commentMore actions
    return "Hello, ${name ?: "Guest"}!"
}

fun main() {
    println(greetCustomer(null))
}