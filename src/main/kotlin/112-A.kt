// Petya and Strings
fun main() {
    var s1 = readLine()!!
    var s2 = readLine()!!
    var answer = s1.compareTo(s2,true)
    if(answer == 0) println(answer)
    else if(answer > 0) println(1)
            else println(-1)
}