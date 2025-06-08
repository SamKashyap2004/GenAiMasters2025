package Day1

import kotlin.random.RandomAdd commentMore actions

fun main() {
    val tipNumber = Random.nextInt(1, 5)
    val tip = when (tipNumber) {
        1 -> "Tip: Reuse your grounds for compost!"
        2 -> "Tip: Stir before sipping!"
        3 -> "Tip: Cold brew is smoother!"
        4 -> "Tip: Add cinnamon for extra aroma!"
        else -> "Enjoy your coffee!"
    }
    println("Coffee Tip: $tip")
}