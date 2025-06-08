package Day1

fun main() {Add commentMore actions
    var strength = 0
    while (strength < 80) {
        println("Brewing... so the current strength is: $strength")
        strength += 20
    }
    println("Coffee is ready! Final strength is: $strength")
}