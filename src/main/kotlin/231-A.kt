fun main() {
    var n = readLine()!!.toInt()
    var ans = 0
    while(n-->0){
        val numbers = readLine()!!.toString().split(" ")
        var a = numbers[0].toInt()
        var b = numbers[1].toInt()
        var c = numbers[2].toInt()
        if(a+b+c >= 2) ans ++
    }
    println(ans)
}