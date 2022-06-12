
// Shaass and Oskols
fun main() {
    var n = readLine()!!.toInt()
    val a = IntArray(4)
    var wires = IntArray(n+2)
    var parser = readLine()!!.split(" ").map { it.toInt() }
    for(i in 1 until n+1)
        wires[i] = parser[i-1]
    var shoots = readLine()!!.toInt()
    while(shoots-->0){
        parser = readLine()!!.split(" ").map { it.toInt() }
        val x = parser[0]
        val y = parser[1]
        wires[x-1] += y-1
        wires[x+1] += wires[x]-y
        wires[x] = 0
    }
    for (i in 1 until n+1)
        println(wires[i])
}