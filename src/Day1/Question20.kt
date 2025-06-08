package Day1

fun main() {Add commentMore actions
    for (order in 1..10) {
        if (order % 3 == 0) {
            println("Skipping decaf order #$order")
            continue
        }
        println("Regular order #$order served")
    }
}