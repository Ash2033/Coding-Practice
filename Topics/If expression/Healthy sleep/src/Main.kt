fun main() {
   val A = readln().toInt()
   val B = readln().toInt()
   val sleep = readln().toInt()
   //sleep H= > A <= B
   /*if(sleep > A) {
      print("Normal")
   }else if(sleep >= B) {
      print("Excess")
   }else if(sleep < A){
   print("Deficiency")}*/
   if(sleep > B) {
      println("Excess")
   }else if ( sleep < A) {
      println("Deficiency")
   }else(println("Normal"))
   }

//print(if (h > mm) "Excess" else if (h < m) "Deficiency" else "Normal")