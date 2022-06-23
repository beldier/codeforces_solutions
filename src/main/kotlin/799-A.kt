import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.max
import kotlin.math.min

// Carrot Cakes
// TODO WA
fun main() {

    var parser = readLine()!!.split(" ").map { it.toInt() }
    var n = parser[0]
    var t = parser[1]
    var k = parser[2]
    var d = parser[3]

    val oneOven = t * (ceil(n.toDouble() / k))


    var max = max(t, d)
    var min = min(t, d)
    var ctt = if (max % min == 0) 0.0 else abs(d-(ceil(max.toDouble()/min) * min))
    val cooked = ceil(max.toDouble()/min) * k
    val missing = n -cooked
    val timeBeforeSecondOven = ceil(max.toDouble()/min) * min
    val timeAfterSecondOven = (ceil(missing / (2 * k)) * t)

    var twoOven =  timeBeforeSecondOven +  timeAfterSecondOven
    if(missing <= k)
        twoOven -= ctt

    if (oneOven <= twoOven) println("NO")
    else println("YES")
}