// Word
fun main() {
    var s = readLine()!!
    var lower = 0
    var upper = 0
    s.forEach { char ->
        if( char.isUpperCase()) upper++
        else lower++

    }
    if(upper > lower)
        println(s.toUpperCase())
    else
        println(s.toLowerCase())
}