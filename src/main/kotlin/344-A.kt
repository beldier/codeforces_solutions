//Magnets
fun main() {
    var n = readLine()!!.toInt()
    var lastChar = 'x'
    var groups = 0
    while (n-- > 0) {
        var s = readLine()!!
        if(s[0] == lastChar){
            groups++
        }
        lastChar = s[1]
    }
    println(groups+1)
}