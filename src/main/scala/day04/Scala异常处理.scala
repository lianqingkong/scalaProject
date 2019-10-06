package day04

object Scala异常处理 {
  def main(args: Array[String]): Unit = {
    try{
      var i = 10 / 0 ;
    }catch{
      case ex:ArithmeticException => println(ex.getMessage());
      case ex:Exception => {println(ex.getMessage()); throw new Exception("出现异常了！！！")}
    }finally {
      println("最终执行的代码")
    }
  }
}
