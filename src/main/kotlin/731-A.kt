import java.lang.Integer.max
import java.lang.Integer.min
import kotlin.math.abs

//Night at the museum
fun main() {
    val str = readLine()!!
    var current = 0
    var ans = 0
    str.forEach { c ->
        var charValue =  c.code - 97
        var right = abs(charValue - current)
        var left = 26 - max(current,charValue) + min(current,charValue)
        ans+= min(right,left)
        current = charValue
    }
    println(ans)
}