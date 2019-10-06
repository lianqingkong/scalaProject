package day05.集合

import scala.collection.mutable.ArrayBuffer

object Scala和Java的集合的互转 {
  def main(args: Array[String]): Unit = {
    // =========scala 数组 to  java数组
    val arr = ArrayBuffer("1","2","3","4")
    println(arr)

    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)
    val arrList =javaArr.command()

    println(arrList)

    // =========java数组 to  scala 数组
    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable
    val scalaArr: mutable.Buffer[String] = arrList  //通过隐士转换

    scalaArr.add("hello scala")
    println(scalaArr)

  }

}
