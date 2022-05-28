//Sereja and Dima
fun main() {
    var n = readLine()!!
    var sCards = readLine()!!
    var cards = sCards.split(" ").map { it.toInt() }
    var s = 0
    var e = cards.size - 1
    var sereja = 0
    var dima = 0
    var turn = true
    while (s <= e) {
        var high: Int = if (cards[s] > cards[e])
                            cards[s++]
                        else
                            cards[e--]
        if (turn) {
            sereja += high
        } else dima += high

        turn = !turn
    }
    println("$sereja $dima")
}