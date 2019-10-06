package day03.函数

object 惰性函数 {
  def main(args: Array[String]): Unit = {
//    当函数返回值被声明为lazy时，函数的执行将被推迟，直到我们首次对此取值，该函数才会执行。
//    这种函数我们称之为惰性函数，在Java的某些框架代码中称之为懒加载(延迟加载)。
    lazy val res = sum(1,2)
    println("-------------------")
    println("res = "+res)


  }
  def sum(n1:Int ,n2:Int):Int={
    println("sum( 被调用了...")
    n1+n2 ;
  }

}
