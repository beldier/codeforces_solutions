//A. Parkway Walk
fun main() {
    var t = readLine()!!.toInt()
    while(t -->0){
        var parser = readLine()!!.split(" ").map { it.toInt() }
        var n = parser[0]
        var m = parser[1]
        var distances = readLine()!!.split(" ").map { it.toInt() }
        var ans = 0
        for(i in distances.indices){
            if(distances[i]>m){
                ans += distances[i] - m
                m = 0
            } else{
                m -= distances[i]
            }
        }
        println(ans)
    }


}