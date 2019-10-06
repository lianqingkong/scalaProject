package day01

object Scala01 {
  /**
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println("hello scala")

    var name =" scala"
    println("hello"+name)


    printf("hello%s",name)
    println()
    println(s"hello$name")
    println(s"hello${name}")
    print(s"hello${name} \n")
    print(raw"hello${name}\n")
    println()
    print(raw"${name.length}\n")
    printf("%4.2f",123.23253)

  }
}
