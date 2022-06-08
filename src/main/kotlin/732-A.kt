//Buy a shovel
fun main() {
    val numbers = readLine()!!.toString().split(" ").map { it.toInt() }
    val shovel = numbers[0]
    var counter =shovel
    val r = numbers[1]
    var ans = 1
    while(true){
        if(counter % 10 == 0 || counter % 10 == r){
            break;
        } else{
            counter+=shovel
            ans ++
        }
    }
    println(ans)
}