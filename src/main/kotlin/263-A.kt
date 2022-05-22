import kotlin.math.abs

fun main() {
    var ans = 0
    for(i in 0 until 5){
        val numbers = readLine()!!.toString().split(" ")
        for(j in 0 until 5){
            val number = numbers[j].toInt()
            if(number == 1){
                ans = abs(2 - i) + abs(2 - j)
            }
        }
    }
    println(ans)
}