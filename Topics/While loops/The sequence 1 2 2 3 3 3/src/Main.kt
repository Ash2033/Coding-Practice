fun main() {
    // put your code here 1: generate list of numbers = to the 1 22 333 4444 rule
    //2: take input n, and output that range from the list
   /*val pattern = MutableList(45)
   { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9}
    var n = readln().toInt()
    val pattern = arrayListOf<Int>(44)
    println("$pattern")
*///var increase = 0
 val prin :MutableList<Int> = mutableListOf()
    val n = readln().toInt()
    for ( n in 0..n)
    repeat(n) {
        //val num = n
        prin.add(n)
    }
    val q =prin.take(n)
    print(q.joinToString().replace(",",""))
    }