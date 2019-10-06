package day02

object 运算符03 {
  def main(args: Array[String]): Unit = {
    val i= 10/3  ;
    println(i)

    val j = 10.toDouble/3 ;
    println(j);

    val num = 10 % 3 ;
    println(num)
    var b = 20 ;
    println(b = 20)  // ()
   var a:  BigDecimal = 8.1 ;
    println(a/3)

    var bb:Byte = 22 ;
    bb= (bb+3).toByte ;
   // bb= bb + 3 ;
    println(bb)
    println(-100 >> 2)
  }

}
