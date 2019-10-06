package day05.隐士转换

object 隐士转换 {
  /**
    *
    */
  def main(args: Array[String]): Unit = {
    //TODO scala 允许开发者自己定义类型转换规则
    //TODO 当scala编译器在编译时候发现类型错误，尝试从开发者的位置查找转换规则进行二次编译
    //TODO 1.  隐士转换不仅仅可以转换类型，还可以扩展功能
    // 自定义隐士转换 遵循OCP规则：不改变原来的代码
    implicit def DoubleToInt(value:Double):Int ={
      value.toInt
    }
    val i :Int = 3.4 ;
    println(i)

    // -----------------------------------------------------
    //TODO 2. -- 使用隐士转换进行 功能扩展  以前的东西不改，增加新的东西。
    // 编译不通过的时候，才会进行隐士转换

    class Person{}
    class User{
      def login()={
        println("user login...")
      }
    }
    implicit def trandform(person:Person):User = {
      new User() ;
    }
    var p:Person = new Person();
    p.login();

    //-------------------------------------
    //TODO 隐士的变量  相同类型的参数进行转换

    //implicit 告诉 没有参数传入的时候，就去找隐士变量来传入
    def test(implicit name:String = "张三" ):Unit={
       println(name)
    }
    //scala允许方法参数进行隐士转换
    implicit val userName:String ="李四"  // 可以灵活多变 比如从数据库中取出来
    test   //李四
    test() //张三

    //---------------------------







  }

}


