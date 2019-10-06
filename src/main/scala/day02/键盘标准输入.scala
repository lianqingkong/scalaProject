package day02

import scala.io.StdIn

object 键盘标准输入 {
  def main(args: Array[String]): Unit = {
    println("请输入姓名：")
    var name = StdIn.readLine()
    println("请输入年龄：")
    var age= StdIn.readInt()

    println(s"name=${name},age=${age}")




  }
}
