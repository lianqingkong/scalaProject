package day06

object 模式匹配 {
  def main(args: Array[String]): Unit = {
    //----------匹配字符-------------
    val oper = '-'
    val n1 = 20
    val n2 = 10
    var res = 0
    oper match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case _ => println("oper error")
    }
  //  println("res=" + res)
//--------------------守卫-----------------------
    //如果想要表达匹配某个范围的数据，就需要在模式匹配中增加条件守卫
    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
          //守卫
        case _ if ch.toString.equals("3") => digit = 3
        case _ => sign = 2
      }
     // println(ch + " " + sign + " " + digit)
    }
//-----------------匹配类型----------------------

    val a = 3
    var obj =
         if(a == 1)  1
    else if(a == 2) "2"
    else if(a == 3) BigInt(3)

    else if(a == 4) Map("aa" -> 1)
    else if(a == 5) Map(1 -> "aa")

    else if(a == 6) Array(1, 2, 3)
    else if(a == 7) Array("aa", 1)
    else if(a == 8) Array("aa")
    //TODO 可以匹配对象的任意类型，这样做避免了使用isInstanceOf和asInstanceOf方法
    //TODO 如果在case关键字后跟变量名，那么match前表达式的值会赋给那个变量
       // TODO Map 是不考虑泛型的，但是Array会考虑泛型
    val result = obj match {
      case a : Int => a
      case b : Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c : Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d : Array[String] => "对象是一个字符串数组"
      case e : Array[Int] => "对象是一个数字数组"
      case f : BigInt => Int.MaxValue
      case _ => "啥也不是"
    }
   // println(result)
  }

  //--------匹配规则-----------------------
//  基本介绍
//  Array(0) 匹配只有一个元素且为0的数组。
//  Array(x,y) 匹配数组有两个元素，并将两个元素赋值为x和y。当然可以依次类推Array(x,y,z) 匹配数组有3个元素的等等....
//  Array(0,_*) 匹配数组以0开始
  println("---------匹配数组------------")
  for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1)))
  {
    val result = arr match {
      case Array(0) => "0"
      case Array(x, y) => x + "=" + y
      case Array(0, _*) => "以0开头和数组"
      case _ => "什么集合都不是"
    }
    println("result = " + result)
  }
println("------------匹配列表---------")
  for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
    val result = list match {
      case 0 :: Nil => "0" //
      case x :: y :: Nil => x + " " + y
      case 0 :: tail => "0 ..."
      case _ => "something else"
    }
    println(result)
  }
  //    case x :: Nil => {
  //      println("匹配到" + (x::Nil))
  //      x :: Nil //直接返回
  //    }
  println("--------匹配元组-------------")
  for (pair <- Array((0, 1), (1, 0), (2, 1),(1,0,2))) {
    val result = pair match {
      case (0, _) => "0 ..."
      case (y, 0) => y
      case (a,b) => (b,a)
      case _ => "other"
    }
    println(result)
  }
//-----------对象匹配--------------
//  对象匹配，什么才算是匹配呢？，规则如下:
//    case中对象的unapply方法(对象提取器)返回Some集合则为匹配成功
//  返回none集合则为匹配失败

  object Square {
    //可以理解为 apply方法的反向操作。 一般使用在模式匹配中
    def unapply(z: Double): Option[Double] = Some(math.sqrt(z))
    def apply(z: Double): Double = z * z
  }

  // 模式匹配使用：
  val number: Double = 36.0
  number match {
    case Square(n) => println(n) //调用unapply方法，z=number=36 ; n= Some(math.sqrt(z)) =6
    case _ => println("nothing matched")
  }






}
