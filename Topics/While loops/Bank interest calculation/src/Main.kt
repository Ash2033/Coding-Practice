import java.util.*
fun findYears(depo: Double): Int{
    var deposit = depo
    val interestRate = 1.071
    val max = 700000
    var years = 0
/*
    do{deposit * interestRate
        ++years}
    while(deposit < max)
    // implement the while loop here
    //
    return years
    println("$years")*/

    while(deposit < max){
        ++years
        deposit = deposit * interestRate

    }
    return years
}