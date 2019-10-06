package day06

object 模式匹配扩展 {
  def main(args: Array[String]): Unit = {
   // for表达式中的模式
    val map = Map("A"->1, "B"->0, "C"->3)
    for ( (k, v) <- map ) {
      println(k + " -> " + v)
    }

    for ((k, 0) <- map) {
      println(k + " --> " + 0)
    }

    for ((k, v) <- map if v == 0) {
      println(k + " ---> " + v)
    }

  }

}
