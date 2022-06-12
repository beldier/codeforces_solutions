// Presents
fun main() {
    var n = readLine()!!.toInt()
    var gifts = readLine()!!.split(" ").map { it.toInt() }
    val ans = IntArray(n)
    for(i in gifts.indices)
        ans[gifts[i]-1] = i+1
    ans.forEach { print("$it ") }
}