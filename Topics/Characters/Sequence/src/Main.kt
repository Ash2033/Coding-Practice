fun main() {
    // put your code here
    val inpt = readln().first().code
    val chk = readln().first().code
    val chk2 = readln().first().code
    inpt
    chk
    chk2
    if ((inpt + 1 == chk) && (chk + 1 == chk2)) {
        println(true)
    }
        else {
            print(false)
        }

}