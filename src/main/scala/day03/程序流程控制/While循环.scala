package day03.程序流程控制

object While循环 {
  def main(args: Array[String]): Unit = {
//    循环条件是返回一个布尔值的表达式
//    do..while循环是先执行，再判断

//    和while 一样，因为do…while中没有返回值,所以当要用该语句来计算并返回结果时,
    // 就不可避免的使用变量 ，而变量需要声明在do...while循环的外部，
    // 那么就等同于循环的内部对外部的变量造成了影响，所以不推荐使用，而是推荐使用for循环
    var i= 1 ;
    while(i%3 ==0 && i<10){
      println("i="+ i) ;
      i +=1 ;
    }
  }

}
