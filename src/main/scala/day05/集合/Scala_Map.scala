package day05.集合

import scala.collection.mutable

object Scala_Map {
  def main(args: Array[String]): Unit = {
    //scala 中的map也是存储KV对
    //----------------不可变的map集合------------------------
    val map: Map[String, Int] = Map("a"->1,"b"->2)

    //添加数据
    println(map+("c"->3))
   // 修改数据
    println(map.updated("b", 5))

    println(map)

    // map 查询数据
    //只有两种结果： Option:Some ,None  代替空指针判断
    println(map.get("a")) //Some(1)
    println(map.get("c")) //None

    println(map.get("a").get) //1
    //println(map.get("c").get) //java.util.NoSuchElementException异常

    println(map.get("a").getOrElse("100")) //1
    println(map.get("c").getOrElse("100")) //100  代替空指针判断

    //map 遍历数据
    val values: Iterable[Int] = map.values
    val keys: Iterable[String] = map.keys

//---------------------------可变Map集合----------------------------------
    val mmap = mutable.Map("a"->1,"bl"->2 )
    //添加元素
    mmap += ("c"->3,"d"->4,"e"->5)  //+ 代表添加元素，= 代表把原来的覆盖
    println(mmap)

    //删除元素
    mmap -=  "a"
   // mmap -=  ("b","c")
    println(mmap)
    println("---")

    //修改数据
    mmap.update("e",7)
    mmap+=("a"->7)  //a已经存在了，那么就是修改值操作
    println(mmap)

    //获取指定元素
    println(mmap.get("e").getOrElse(200))

    //mmap

    //---------------------元组 Tuple------------------------
    //TODO 元组 Tuple ： 把一个无关联的数据当成一个整体来使用
    // 虽多只能有22 个无关数据当成一个整体



    //声明元组：使用小括号
    val tuple: (String, Int, String) = ("abc",123,"s")

    //使用特殊方来访问元组 某个数据
    val v1: String = tuple._1
    println(v1)

    //使用迭代器遍历元组数据(不推荐)
    val iterator: Iterator[Any] = tuple.productIterator
    for (elem <- iterator) {
      print(elem+" ")
    };println;

    //TODO 如果元组中的元素只有两个，我们称之为“对偶”，Map集合中的KV其实就是对偶
     val map2 = Map(("aa",11),("bb",22))
     println(map2)

    map2.foreach(println)

    //map操作
    map2.foreach(t=>{println("key="+t._1+" value="+t._2)})
    map2.foreach{
      case (key,value)=>   //模式匹配
       {println("key="+key+" value="+value)}
    }




  }

}
