package day03.程序流程控制

object if分支控制 {
  def main(args: Array[String]): Unit = {
    var x = 4;
    var y = 1 ;

    // 1.scala中所有的表达式和运算都是有返回值的
    // 2.这里的返回值是表达式满足条件的租后一行代码的效果。
    // 3. 如果没有返回值，那么返回结果为Unit 即 （）
   var ret = if(x >= 4) x else y
    println(ret)
    var ret2 = if(x>=4) x ;
    println(ret2)

  }

}
