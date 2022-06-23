import java.util.Stack

// Team Olympiad
fun main() {
    var n = readLine()!!.toInt()
    var childrens = readLine()!!.split(" ").map { it.toInt() }
    var programmingStack = Stack<Pair<Int,Int>>()
    var mathStack = Stack<Pair<Int,Int>>()
    var peStack = Stack<Pair<Int,Int>>()
    for(i in childrens.indices){
        when(childrens[i]){
            1 -> programmingStack.push(Pair(i+1,childrens[i]))
            2 -> mathStack.push(Pair(i+1,childrens[i]))
            3 -> peStack.push(Pair(i+1,childrens[i]))
        }
    }
    if(mathStack.isEmpty() || programmingStack.isEmpty() || peStack.isEmpty())
        println(0)
    else{
        var ans = mutableListOf<String>()
        while(!mathStack.isEmpty() && !programmingStack.isEmpty() && !peStack.isEmpty()){
            var a = programmingStack.pop().first
            var b = mathStack.pop().first
            var c = peStack.pop().first
            ans.add ("$a $b $c")
        }
        println(ans.size)
        ans.forEach{println(it)}
    }
}