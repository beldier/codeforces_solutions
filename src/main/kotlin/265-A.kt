// Colorful Stones
fun main() {
    val s = readLine()!!
    val t = readLine()!!
    var i = 0
    var j = 0
    while (j < t.length) {
        if (s[i] == t[j]) i++
        j++
    }
    println(i + 1)
}