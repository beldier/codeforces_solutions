fun main() {
    readLine()
    val s = readLine()!!.toString()
    var anton = 0
    var danik = 0
    for(c in s){
        if(c == 'A') anton++
        else danik++
    }
    if(anton > danik) println("Anton")
    else
        if(anton < danik) println("Danik")
        else println("Friendship")
}