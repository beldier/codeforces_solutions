// Free Ice Cream
fun main() {
    var parser = readLine()!!.split(" ").map { it.toLong() }
    var n = parser[0]
    var x = parser[1]
    var kids = 0
    while (n-- > 0) {
        var parser = readLine()!!.split(" ")
        if (parser[0] == "+") {
            x += parser[1].toLong()
        } else {
            if (x < parser[1].toLong()) {
                kids++
            } else {
                x -= parser[1].toLong()
            }
        }
    }
    println("$x $kids")
}