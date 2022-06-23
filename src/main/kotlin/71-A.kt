// Way Too Long Words
fun main() {
    var n = readLine()!!.toInt()
    while (n-- > 0) {
        val word = readLine()!!
        if (word.length > 10) {
            println(word[0].toString() + (word.length - 2) + word[word.length - 1].toString())
        } else {
            println(word)
        }
    }
}