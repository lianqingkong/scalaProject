package day04

object Scala接口_特质trait {
  /**
    *java :接口 implements
    * scala :特质(特征) extends
    *
    * scala 中没有接口的概念，有类似的特质的概念：trait
    *
    * scala 中可以继承特质，但是同时可以继承父类，使用with 关键字：
    *      class MyPerson extends MyParent with MyTrait
    *
    * scala 如果一个类有父类，同时具有特质，那么在执行时候，
    *        会首先执行父类的构造方法，然后执行特质的操作，接着执行类的构造方法
    *  (trait  MyTrait  、class MyParent 、 class MyPerson extends MyParent with MyTrait )
    *
    *  如果同时父类也继承了相同的特质，那么父类的特质先执行，而子类的特质就不会再执行了。
    *  trait  MyTrait  、class MyParent extends MyTrait、 class MyPerson extends MyParent with MyTrait
    *  MyTrait...  MyParent...  MyPerson...
    *
    * scala可以将java中的接口当成特质来用。
    *
    *
    */
  def main(args: Array[String]): Unit = {

/*//    val mysql = new MySQL()
////    mysql.insert();*/

    /*//将特质动态混入到类中: 动态扩展程序的功能
      val mysql = new MySQL2() with DB
      mysql.insert();*/

      val mysql = new MySQL3
      mysql.insert()
  }
}
//---------------------------
trait MyTrait{
  println("MyTrait...")
}
class MyParent extends MyTrait{
  println("MyParent...")
}
//继承了父类，并实现了特质
class MyPerson
    extends MyParent  //继承父类
    with MyTrait    //实现特质
    with Serializable  //实现java中的接口
{
  println("MyPerson...")
}

//--------------------------------
//TODO trait 中的方法可以是抽象的，也可以有具体实现的，具体的类都含有相应的方法。
//TODO trait 在scala中可以继承其他的类
trait Operate extends Exception{
  println(" Operate 构造方法")
  def insert()={
    println("开始插入数据...")
  }
}
trait DB extends Operate{
  println(" DB 构造方法")

  override def insert(): Unit ={
    println("向数据库插入数据")
    super[Operate].insert()
  }
}
trait File extends Operate{
  println(" File 构造方法")

  override def insert(): Unit ={
    println("向文件中插入数据")
    super[Operate].insert()
  }
}
class MySQL extends DB{}

//--------------------------------
// 特质的 动态混入
class MySQL2 {}
/*
main(){
  val mysql = new MySQL2() with DB
  mysql.insert();
}
*/
//------------------------------------
//TODO trait 在继承时候，构造从 左到右 继承，但是在调用方法时候  从右向左 调用。
// TODO trit 方法调用时候，super不是上一级的意思，是上一个trait的意思。
// 构造：Operate -> DB -> File   方法调用：File -> DB -> Operate

//TODO  如果在super关键字后面增加中括号[] ，其中增加特质泛型，那么可以调用指定特质的方法。
// TODO super.insert() 改为 super[Operate].insert() 明确指定 走上一级，而不是上一个
// 构造：Operate -> DB -> File      方法调用：File -> Operate  跳过了 DB 的inert 方法
class MySQL3 extends DB with File {}
//向文件中插入数据
//向数据库插入数据
//开始插入数据...

// -----------------------------------
