package day04
//TODO 1. scala中可以有多个包
package test1 //全名称为： Dya04.test1
{
  //TODO 2. 包也被看作一个对象使用
  class Emp1{
  }
  package test4{
    class Emp5{}
  }
  package test3{
    import day04.test1.test4.Emp5
    class Emp4{
        def test()={
          //TODO 3. 子包中的类访问父包中的类，没有导入父包就能使用父包中的类。(java中就不能这么用)
          var emp1 = new Emp1();
          var emp5 = new Emp5();
        }
    }
  }
}

package test2 //全名称为： Dya04.test1.test2
{
  class Emp2{}
  // TODO java中 收到JVM的限制，包中只能声明类 和 方法，不能声明变量
  //TODO 4. 包对象 概念
  package object test5 {
    var i = 100 ;
  }
  //简写为
  object test7 {
    var i = 100 ;
  }
  package test6{
     class Emp6{
       def test(): Unit ={
          test5.i ; // 直接使用包对象中的属性
       }
     }
  }
}
class Emp3{
}
package test8{

  import day04.test8.java.util
  package java{
    package util{
      class HashMap(){}
    }
  }

  object Scala_root_{
    def main(args: Array[String]): Unit = {
      // 这种形式用的是 相对顶层包 Day04 下的类 。
      new java.util.HashMap () ;  //Day04.java.util.HashMap()

      //如果想使用java.util.HashMap()下的包 需要 _root_ 来指定包名为绝对路径。
      new _root_.java.util.HashMap()
    }
  }
}

object Scala包01 {
  /**
    *包
    * 1) 对类 分类管理 dao,service,controller,bean
    * 2) 权限管理
    * 3） 区分类
    *
    * scala 语法对包进行扩展
    * 1）源码所在的路径可以和包名不一致
    * 2）源码中package关键字可以多次声明，使用时候组合在一起使用。
    * 3) scala 可以将包当成对象来使用
    * package Dya04
    * import Dya04.test1.Emp1
    * import Dya04.test2.Emp2
    * object Scala包02 {
    * def main(args: Array[String]): Unit = {
    * var emp:Emp1 = new Emp1();
    * var emp2:Emp2 = new Emp2();
    * var emp3:Emp3 = new Emp3();
    * }
    * }
    * 4) package 中仍然可以使用 package，
    * 5）scala中的包有作用域的概念，子包可以直接访问父包的内容，但是父包访问子包需要导入。
    * 6)包对象的概念。可以定义变量。
    */
  def main(args: Array[String]): Unit = {

  }
}


