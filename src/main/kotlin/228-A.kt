//Is your horseshoe on the other hoof?
fun main() {
    val numbers = readLine()!!.toString().split(" ")
    println(4 - numbers.distinct().size)
}