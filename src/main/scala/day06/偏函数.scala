package day06

object 偏函数 {
  def main(args: Array[String]): Unit = {
    //简化形式1
    def f2: PartialFunction[Any, Int] = {
      case i: Int => i + 1 // case语句可以自动转换为偏函数
    }
    val list2 = List(1, 2, 3, 4,"ABC").collect(f2)

    //简化形式2
    val list3 = List(1, 2, 3, 4,"ABC").collect{ case i: Int => i + 1 }
    println(list3)

    val list4 = List(1, 2, "a", 4,List(1,2,3)).flatMap{
      case y:Iterable[Int]=> y
      case a => List(a)
    }
    println("list4="+list4)

  }

}
