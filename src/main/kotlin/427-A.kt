// Police Recruits
fun main() {
    var n = readLine()!!.toInt()
    var events = readLine()!!.split(" ").map { it.toInt() }
    var officers = 0
    var ans = 0
    events.forEach{ current ->
        if(current == -1)
            if(officers<=0)
                ans ++
            else
                officers--
        else
            officers += current
    }
    println(ans)
}