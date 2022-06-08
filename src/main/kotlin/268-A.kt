// Games
fun main() {
    var t = readLine()!!.toInt()
    val pairList = ArrayList<Pair<Int, Int>>()
    while (t-- > 0) {
        val numbers = readLine()!!.split(" ").map { it.toInt() }
        pairList.add(Pair(numbers[0], numbers[1]))
    }
    var ans = 0
    for (i in 0 until pairList.size) {
        for (j in 0 until pairList.size) {
            if (i != j && pairList[i].second == pairList[j].first) {
                ans++
            }
        }
    }
    println(ans)
}