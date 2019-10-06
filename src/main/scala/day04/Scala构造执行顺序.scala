package day04

object  Scala构造执行顺序 {
  /**
    *
    */
  def main(args: Array[String]): Unit = {
//    var stu = new Student2("张三");
/*    var stu3 = new Student3();
      println(stu3.name)
//    父类构造方法
//    父类构造方法：有参数 name=李四
//    子类构造方法 name=李四
//    李四
    */
  }
}
class Person2{
  println("父类构造方法")
  def this(name :String ){
    this();
    println("父类构造方法：有参数 name="+name )
  }
}
//显示调用父类的构造方法
class Student2 extends Person2("李四") {

  var name =""
  println("子类构造方法")

  def this(name:String ){
    this();
    println("子类构造方法：有参数")
  }
}

// 主构造方法不一定是无参的
//如果构造方法中的参数增加了var 或者 val关键字，那么scala会自动添加类的属性
class Student3(val name:String="李四") extends Person2(name) {
  println("子类构造方法 name="+name )

}