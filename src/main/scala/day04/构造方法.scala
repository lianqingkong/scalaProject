package day04

object 构造方法 {
  /**
    * scala中构造方法比较特殊
    * scala中的类其实也是函数，可以在类声明时名称后增加()小括号作为参数列表，表示构造方法。
    *
    */
  def main(args: Array[String]): Unit = {
    //在scala中，构造对象，等同于调用类的构造方法，执行方法体的内容。
    // scala中，构造法方法可以声明在其他的位置。
      var aaa = new AAA("张三");
  }
}
object AAA{

}
//主构造方法
class AAA(){
     var name:String =_ ;
    //类体 & 构造方法体
    println("AAA的构造方法... name="+name )

    // 构造方法（辅助）
    def this(name:String)={
      //在辅助构造方法中，一定要直接或间接的调用主构造方法。否则报错。
      this();
      this.name = name ;
      println(this.name)
    }
}
