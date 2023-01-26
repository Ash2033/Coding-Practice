fun main() {
    val n = readln().toInt()
    //val std = 0
        var count1 = 0
    var count3 = 0
    var count2 = 0
    repeat(n){
        val rd = readln().toInt()
        if (rd == 0){++count1}
        else if (rd > 0){++count2}
        else if (rd < 0){++count3}
    }
    print("$count1 $count2 $count3")
}
