package day05.集合

object 单词计数 {
  def main(args: Array[String]): Unit = {
    val lines: List[String] = List("Hello word","Hello Scala","Hello Scala")

    //分解单词，扁平化
    print(


    lines
      .flatMap(line=>line.split(" ")) //List(Hello, word, Hello, Scala, Hello, bigdata)
      .groupBy(word=>word) //Map(Hello -> List(Hello, Hello, Hello), word -> List(word), bigdata -> List(bigdata), Scala -> List(Scala))
     .map{
            case (key,v)=> (key,v.length)
      } //Map(Hello -> 3, word -> 1, bigdata -> 1, Scala -> 1)
        .toList
        .sortBy{case (key,value)=> key}
        .sortWith{
          case ((leftWord,leftCount),(rightWord,rightCount))=>
            leftCount < rightCount
        }


    )
  }


}
