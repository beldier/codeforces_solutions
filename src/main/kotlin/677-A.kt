fun main() {
    val nums =readLine()!!.split(" ")
    val n = nums[0].toInt()
    val h = nums[1].toInt()
    var res = 0
    val currentFriends = readLine()!!.split(" ")
    for( i in 0 until n){
        val current = currentFriends[i].toInt()
        if(current<= h ) res ++
        else{
            res+= (current/h)
            if(current % h != 0) res ++
        }
    }
    println(res)
}