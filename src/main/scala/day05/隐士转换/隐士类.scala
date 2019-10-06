package 隐士转换

object 隐士类 {
  def main(args: Array[String]): Unit = {
    // TODO 把 一个User1类型 变为我当前的Person1类型
    // TODO 类声明时候必须有一个参数的构造方法
    // TODO 隐士转换在scala编译时进行查找，默认当前作用范围
         // 如果当前作用域找不到，还从上级的伴生对象、包对象查找
    implicit class Person1(user:User1){
      def test()={
        println("test ...")
      }
    }
    class User1{}
    var user = new User1();
    //对User1 进行了功能扩展。
    user.test() ;

    var person1 = new Person1(null);
    person1.test()


    val user2 = new User2()
    user2.test();


  }

}
class User2 extends MyTrait2 {

}
trait MyTrait2{}
object MyTrait2{
  implicit class Test(name:User2) {
      def test()={
        print("MyTrait2_test")
      }
  }
}


