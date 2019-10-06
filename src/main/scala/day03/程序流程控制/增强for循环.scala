package day03.程序流程控制



object 增强for循环 {
  def main(args: Array[String]): Unit = {
    // TODO 1. 前后闭合 to [1,3]，包含1,3
    for(i <- 1 to 3 ){
      print(i+" ") //1 2 3
    }

    //TODO 2. 前闭后开 unit [1,3) , 不包含 3
    println ;
    for(i <- 1 until 3 ){
      print(i+" ")
    }
    //TODO 3. 使用Range
          //scala的for循环其实是对范围对象Range进行循环
     // 范围对象可以传递三个参数 ：start ,end ,step步长
    println ;println(1 to 3  ); //Range(1, 2, 3)
    println ;
    for(i <- Range(1,5,2)){ // 前闭后开，不包含5
      print(i+" ")
    }

      //TODO 4.  循环守卫
    //
    println ;
    for(i<- 1 to 3 if i !=2 ){
      print(i+" ")  //1 3
    }

    //TODO 5. sacla中的break  以方法调用的形式出现的
    //形式1：
    import scala.util.control.Breaks
    Breaks.breakable{
        for(i <- 1 to 5){
          if(i==3){
            Breaks.break() ;
          }
        }
    }
    //形式2：
    import scala.util.control.Breaks._
    breakable{
      for(i <- 1 to 5){
        if(i==3){
          break; //break(); 括号没值 可以去掉
        }
      }
    }

    // TODO 6. 循环中 增加变量 j
    //形式1：
    for(i <- Range(1,18,2)){
      println(" "*((18-i)/2)+"*"*i)
    }
    //形式2：
    for(i <- Range(1,18,2);j=(18-i)/2){
      println(" "*j+"*"*i)
    }
    // TODO Scala可以在一个表达式中声明多行语句时候，为了方便理解，可以将小括号() 变成花括号{}
    //形式3：
    for{
      i <- Range(1,18,2);
      j=(18-i)/2
    }{
      println(" "*j+"*"*i)
    }

    //TODO 7.for循环也有返回值,默认值为Unit。
    // TODO 需要yield关键字。
    // TODO  yield  将遍历过程中处理的结果放到一个新的Vector集合中，进行返回
    val result = for(i <- 1 to 3) yield i*2
    println(result) //Vector(2, 4, 6)


  }

}
