// WA
fun main() {
    var n = readLine()!!.toInt()
    while(n-->0){

        var length = readLine()!!.toInt()
        var numbers = arrayListOf<Int>()
        val nums = readLine()!!.toString().split(" ")
        for (i in 0 until length) {
            var number = nums[i].toInt()
            numbers.add(number)
        }
        numbers.sort()
        var answer = length + 1
        var zeroes = 0
        numbers.forEach { n -> if (n == 0) zeroes++ }
        answer -= zeroes
        numbers = numbers.filter { n -> n!=0 } as ArrayList<Int>
        var distinct = numbers.distinct().size
        if(distinct != length){
            answer -= (distinct/2)
        }
        if(distinct == length) answer = distinct + 1
        else{
            if(zeroes > 0){
                answer = length - zeroes

            } else {
//                answer = length - ()
            }

        }
        println(answer)

        val num = double(4)
    }

}
fun double(x:Int): Int {
    return x*x
}
