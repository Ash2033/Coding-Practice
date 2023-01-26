fun main() {
    // put your code here
    val inpt = readln().first().code // uses the code attribute of characters to make it into an integer
    val chk = readln().first().code
    val chk2 = readln().first().code
    inpt //initializes each input
    chk
    chk2
    if ((inpt + 1 == chk) && (chk + 1 == chk2)) { //checks if the first input is the same as the 2nd plus 1 rung on the unicode ladder, then against the next as well, and if they're in line it prints true, if not it prints false
        println(true)
    }
        else {
            print(false)
        }

}