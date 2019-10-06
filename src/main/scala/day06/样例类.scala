package day06

object 样例类 {
  //说明: 这里的 Dollar，Currencry, NoAmount  是样例类。
  //可以这样理解样例类，就是样例类会默认其它很多的方法，供程序员直接使用

  /* //sealed
  如果想让case类的所有子类都必须在申明该类的相同的源文件中定义，可以将样例类的通用超类声明为sealed，这个超类称之为密封类。
  密封就是不能在其他文件中定义子类。*/

  abstract sealed class Amount
  case class Dollar(value: Double) extends Amount
  case class Currency(value: Double, unit: String) extends Amount
  case object NoAmount extends Amount

  def main(args: Array[String]): Unit = {
    // 当我们有一个类型为Amount的对象时，可以用模式匹配来匹配他的类型，
    // 并将属性值绑定到变量(即：把样例类对象的属性值提取到某个变量)
    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
      val result = amt match {
        case Dollar(v) => "$" + v
        case Currency(v, u) => v + " " + u
        case NoAmount => ""
      }
      println(amt + ": " + result)
    }


    case class User(var name :String)
    val user = User("张三")
    user.name = "李四"
    println(user.name )
  }
}


