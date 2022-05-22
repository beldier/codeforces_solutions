import kotlin.math.abs

fun main() {
    var n = readLine()!!.toInt()
    val numbers = readLine()!!.toString().split(" ")
    var array = mutableListOf<Int>()
    for(i in 0 until n  ){
        array.add(numbers[i].toInt())
    }
    array.sort()
    for(i in 0 until n){
        print(array[i].toString()+ " ")
    }

}