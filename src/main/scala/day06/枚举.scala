package day06

object 枚举  extends  App {
  println(ColorEnume.RED)
  println(ColorEnume.values)

}
object ColorEnume extends Enumeration{
  val RED = Value(0,"red")
  val BLUE= Value(1,"blue")
  val BLACK = Value(2,"black")

}
