//Boy or Girl
fun main() {
    var s = readLine()!!
    var charSet : HashSet<Char> = hashSetOf()
    s.forEach { char ->
        charSet.add(char)
    }
    if(charSet.size % 2 == 0)
        println("CHAT WITH HER!")
    else
        println("IGNORE HIM!")
}