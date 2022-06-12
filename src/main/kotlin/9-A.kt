// Die roll

fun main() {
    val numbers = readLine()!!.toString().split(" ").map { it.toInt() }
    var y = numbers[0]
    var w = numbers[1]
    var max = y.coerceAtLeast(w)
    val chances = 6 - max + 1
    println("1/${chances}")

}