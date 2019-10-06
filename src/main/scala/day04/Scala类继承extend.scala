package day04

object Scala类继承extend {
  def main(args: Array[String]): Unit = {
    val student1 = new Student1() ;
    println(student1.name);
  }
}
class Person{
  val prefix ="persion"
  val name = prefix + "zhagnsan"
}
// 问题：如果父类的属性依赖于子类的属性，那么运行时候，会出先错误
//解决方法：使用特殊的语法结构提前让属性初始化。如下：
class Student1 extends {
  // 马上覆盖掉Person 的属性
   override val prefix: String = "kkk"
} with Person{

}