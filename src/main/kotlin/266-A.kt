// Stones on the table
fun main() {
    var n = readLine()!!.toInt()
    var s = readLine()!!
    var ans = 0
    var lastChar = '@'
    s.forEach { c ->
        if(c == lastChar)
            ans++
        else
            lastChar = c
    }
    println(ans)
}