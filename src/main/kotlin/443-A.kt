// Anton and letters
fun main() {
    val line = readLine()!!
    var parser = line
        .substring(1, line.length - 1)
        .filter { !it.isWhitespace() }
        .split(",")
        .filter { it.isNotEmpty() }
    println(parser.distinct().size)
}