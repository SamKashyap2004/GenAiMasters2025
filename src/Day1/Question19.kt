package Day1

fun main() {Add commentMore actions
    for (order in 1..10) {
        if (order == 5) {
            println("Rush hour! Taking a break.")
            break
        }
        println("Processing order #$order")
    }
}