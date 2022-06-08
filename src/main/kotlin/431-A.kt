//Black Square
fun main() {
    val numbers = readLine()!!.toString().split(" ")
    val counters = IntArray(4)
    val s = readLine()!!
    s.forEach { c ->
        val current = c.toString().toInt()
        counters[current-1]++
    }
    var ans = 0
    for( i in 0 until 4){
        ans += (numbers[i].toInt()*counters[i])
    }
    println(ans)
}