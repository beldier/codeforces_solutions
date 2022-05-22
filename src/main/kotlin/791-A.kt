fun main() {
    val nums = readLine()!!.toString().split(" ")
    var a = nums[0].toInt()
    var b = nums[1].toInt()
    var ans = 0
    while(a <= b){
        a*=3
        b*=2
        ans++
    }
    print(ans)


}