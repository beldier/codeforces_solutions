// Promo
import java.math.BigInteger

fun main() {
    var parser = readLine()!!.split(" ").map { it.toInt() }
    var n = parser[0]
    var q = parser[1]
    var items = readLine()!!.split(" ").map { it.toInt() }.sorted()
    var sums = arrayOfNulls<BigInteger>(n+1)

    var prev = BigInteger.valueOf(items[n-1].toLong())
    sums[n-1] = prev
    for (i in n-2 downTo 0) {
        sums[i]= BigInteger.valueOf(items[i].toLong()).plus(prev)
        prev = sums[i]
    }
    while(q -->0){
        parser = readLine()!!.split(" ").map { it.toInt() }
        var x = parser[0]
        var y = parser[1]

        println(sums[sums.size-1-x]!!.minus(sums[sums.size-1-x+y]?:BigInteger.ZERO))
    }
}