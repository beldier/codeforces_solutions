// Helpful Maths
fun main() {
    var s = readLine()!!.split("+")
    s = s.sorted()
    var ans = ""
    s.forEach {
        ans += "$it+"
    }
    println(ans.substring(0, ans.length - 1))
}