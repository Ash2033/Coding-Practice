fun main() {
    // put your code here

    var num = readln().toInt()
    if (num == 1)
    else
    do {
        print("$num ")
        if (num % 2 == 0) num = num / 2 else num = (num * 3 + 1)
    } while (num != 1)
    print(num)
}