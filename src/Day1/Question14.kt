package Day1

fun main() {Add commentMore actions
    val temperature = 65
    val tempStatus = when {
        temperature < 50 -> "Cold Coffee?"
        temperature in 50..75 -> "It's Perfect"
        else -> "Too Hot"
    }
    println("Coffee temperature: $tempStatus")
}