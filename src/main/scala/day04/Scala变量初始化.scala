package day04

import scala.beans.BeanProperty

object Scala变量初始化 {
  /**
    * scala 中声明的属性必须明确的初始化，否则会发生错误。
    * scala中如果属性没有访问修饰符，那么默认为公共权限，而且scala会同时生成公共的set/get方法。
    * 如果生命属性的权限为私有private 的，那么set/get方法也是私有的。
    *
    * scala中可以增加注解  @BeanProperty ,可以动态添加 set/get 方法   setName getName
    *
    * protected关键字在scala中，只能同类，子类能访问，其他类无法访问，即使是同包也不能访问。
    * 同包访问，需要特殊说明：实例如下
    *     //同包访问  protected[Dya04]   Dya04同包下的类都能访问此属性
    *     protected[Dya04] var address: String = _ ;
    *
    */
  def main(args: Array[String]): Unit = {
     val t:T = new T() ;
    t.name ="张三"
    println(t.name)

    t.name_$eq("李四")
    println(t.name)

    t.name_=("李四2")
    println(t.name)

    println(t.age)

    val t2:T2 = new T2() ;
    t2.setAge(20)
    t2.setName("张三3")
    println(t2.age +" "+t2.name )
  }

}
class T{
  var name:String = _ ;
  var age:Int = _ ;
}
class T2{

  @BeanProperty var name:String = _ ;
  @BeanProperty var age:Int = _ ;
}

class Emp{
  //公共
  @BeanProperty var name:String = _ ;
  //私有
  private var age:Int = _ ;
  //受保护的
  protected var email:String =_;
  //同包访问  protected[Dya04]   Dya04同包下的类都能访问此属性
  protected[day04] var address: String = _ ;
}
class EmpOther{
  def test(): Unit ={
    val emp:Emp = new Emp();
    //emp.email ="" // 不能访问，报错
    emp.address =""
  }
}
class EmpSub extends Emp{
  def test ()={
    email ="子类访问父类属性"
    address ="地址"
  }
}
