package day04

object scala类的扩展 {
  def main(args: Array[String]): Unit = {
    val bbb = new CCC() ;
    bbb.test;
  }
}
abstract class BBB{
  //声明抽象属性  如果一个属性没有初始化，就称之为抽象属性
  var name:String ;
  val age:Int = 20 ;
  def test ; //声明抽象方法，没有实现
  def test2()={}
}
class CCC extends BBB{
  var name = "李四" ;//类可以重写父类的属性
  //如果子类重写父类的具体属性，必须使用override关键字。
  // 而且具体的属性还必须是不可变的 val修饰。
  override val age:Int = 30 ;


  override def test: Unit = { //这里可以省略override关键字
    println("naem = " + name )
  }
  //如果子类重写父类中具体的方法，必须采用override关键字。
  override def test2()={}
}