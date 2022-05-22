fun main() {
    var t = readLine()!!.toInt()
    while (t-- > 0) {
        val n = readLine()!!.toInt()
        val s = readLine()!!
        var lastMalePos = if (s[0] == '0') 0 else -1
        var ans = 0
        for (i in 1 until n) {
            if(s[i] == '0'){
                if(lastMalePos == i - 1 && lastMalePos>=0){
                    ans +=2
                } else{
                    if( lastMalePos == i -2 &&lastMalePos>=0)
                        ans +=1
                }
                lastMalePos = i
            }
        }
        println(ans)
    }
}