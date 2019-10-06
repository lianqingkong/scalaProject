package day03.函数

object 函数式编程超级操作 {
  def main(args: Array[String]): Unit = {
    //TODO scala是完全面向函数的语言，scala中的类其实也是一个函数

    //TODO 将函数当成参数
    // 将符合要求的函数作为参数传递给另外一个函数
    def f0(age:Int):Int  = age ;
    def f1(f:(Int)=>Int)=println("age="+f(20));
    f1(f0);

    //TODO 将一个函数  作为返回值 返回 ；  _ 表示不调用函数
    def f2()= f0 _
    f2()(20) ;

    //TODO 函数的柯里化 （底层就是闭包）  是为了完成隐士转换而存在的。
    // def f6(i:Int)(j:Int)=println(i+j)
    // 隐士转换会用到，很有用。
    def f3()(age:Int)={
      println("age="+age)
    }
    f3()(20) ;

    //TODO 闭包 改变局部变量的声明周期，将变量包含到当前函数的内部，形成一个闭包的效果。
    //scala 中函数可以在任意位置声明
    def f4(a:Int=0)={
       def f5(age:Int) =  println("age="+(age+a));
       f5 _ ; //返回函数 f5
    }
    f4()(20) ;

    //=====================================
    //TODO 匿名函数 传递一段逻辑进去
    def f7(f:String=>Unit)=f("张三")
    def f8(s:String)=println("hello"+s)
    f7(f8)
    //没必要另外实现一个f8函数，使用匿名函数代替它
    f7((x:String)=>{println(x)})
    f7((x)=>{println(x)})
    f7((x)=>println(x))
    f7(x=>println(x))
    f7(println(_)) //_ 代表占位符  f7(println(_+_))



  }
}
