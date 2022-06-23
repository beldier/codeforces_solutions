// Juicer
fun main() {
    var parser = readLine()!!.split(" ").map { it.toInt() }
    var n = parser[0]
    var b = parser[1]
    var d = parser[2]
    var juice = 0
    var ans = 0
    parser = readLine()!!.split(" ").map { it.toInt() }
    for(i in parser.indices){
        var orange = parser[i]
        if(orange <= b){
            juice+=orange
            if(juice > d){
                juice =0
                ans++
            }
        }
    }
    println(ans)
}