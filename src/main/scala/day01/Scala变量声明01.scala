package day01

object Scala变量声明01 {
  def main(args: Array[String]): Unit = {
    //Scala中使用var ,val声明变量

    //1. Scala中的变量可以使用自动推断功能推断类型，所以类型不是必须声明的。但是也可以声明
    var s = "ABC"
    var s2: String = "ABD"
    println(s);
    println(s2)

    var b = true;
    println(b)


    //2. var 关键字声明的变量 的值可以改变
    //   val 关键字声明的变量 的值不可以改变，类似java中的常量（final修饰）
    val num = 20;
    var num2 = 20;
    println(num)
    //num = 10 ;
    num2 = 10;

    // 3. Scala中的变量声明的时候必须进行初始化。否则就会报错。
    //4.  变量值类型一旦确定，就不能改变了。
         //num2 = true ;  //报错

    // 5. val 修饰的 对象属性 在编译后，等同于加上了final

    var i: Char = 10 ;

  }
  }
