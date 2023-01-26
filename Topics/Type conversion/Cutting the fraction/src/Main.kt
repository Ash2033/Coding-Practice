fun main() {
    // write your code here
        //read input number, convert to double
    val inpt = readln()
    //catch the trap
    /*val inpt2 : Long = inpt.toLong()
    //val inpt2 : Double = inpt.toDouble()
   val inpt3 : Float = inpt2.toFloat()
        //cut off fraction
    val inum = inpt3.toInt()
    */    // print result as a whole integer as type Long
    val res : Long = inpt.toDouble().toLong()
    println(res)

}