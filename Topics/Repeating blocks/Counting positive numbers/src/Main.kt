fun main() {
    val num = readln().toInt()
    var cnt = 0
    repeat(num){
        val chk = readln().toInt()
        if(chk > 0){
            ++cnt

        }
    }
    println("$cnt")
}