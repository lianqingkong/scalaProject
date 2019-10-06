package day04

object 类信息 {
  def main(args: Array[String]): Unit = {
    //1. ----------------------
    //方式1
    val clazz = Student.getClass
    //2. ----------------------
    //方式2
    //classOf[T] 等价于java中的 T.class
    val stuClass = classOf[Student]

    //3. ----------------------
    val kk:KK = new KK2() ;
    if(kk.isInstanceOf[KK2]){
    //  kk.test()
      val kk2:KK2 = kk.asInstanceOf[KK2] ;
      kk2.test()
      kk2.test2()
    }
    //4. ----------------------
    //给类起别名
    type K =KK ;
    val k:KK = new K() ;

  }
}

class KK {
  def test(): Unit ={
    println("KK")
  }
  def test2(): Unit ={
    println("KK")
  }
}
class KK2 extends KK{
  override def test(): Unit ={
    println("KK2")
  }
}

