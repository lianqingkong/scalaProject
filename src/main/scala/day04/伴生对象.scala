package day04
object 伴生对象 {

  def main(args: Array[String]): Unit = {
    //通过伴生对象获取伴生类
    val student = Student("张三") ;
    println(student)
  }
}
/**
  * 所谓的方法，其实就是函数，所以语法规则和函数式完全一样的。
  * 伴生对象中可以声明apply方法，可以通过调用此方法来构建伴生对象。
  * 这种方式构建对象时候，是可以不需要使用new 关键字的。
  *
  */
object  Student{ //伴生对象
  def apply(name:String ): Student = new Student(name)
}
class Student(name:String){  //伴生类
}

