package day04

object 单例模式 {
  def main(args: Array[String]): Unit = {
       val ss = SingleClass("真三")
      ss.test()
  }

}
//private  使得构造方法私有化
class SingleClass private(name:String){
//  def this(){
//    this("张三")
//    println("=======")
//  }
  def test()={
  println("hello scala")
}
}
object SingleClass {
  def apply(name: String): SingleClass = new SingleClass(name)
}
