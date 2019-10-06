package day05.集合

import scala.collection.mutable.ArrayBuffer

object Scala_数组Array {
  def main(args: Array[String]): Unit = {
    //java.int[] ==> scala:Array
    // TODO 默认情况下，scala中集合的声明全部是不可变的

    //===========================不可变数组===========================
    val arrays:Array[Int] = Array[Int](1,2,3) ;
    println(arrays.length)

    //给数组增加元素 ,表示创建新的集合
    val newArrays:Array[Int] = arrays:+5 ; //在集合尾部添加数据
    val newArrays2:Array[Int] = 5+:arrays  //在集合头部添加数据
    println(arrays.length)
    println(newArrays.length)

    //查询数组中的数据
    for (elem <- arrays) print(elem+" ");println ;
    println(newArrays.mkString(","))
    println(newArrays2.mkString("-"))

    println(arrays(0))
    //修改数组中的数据
    arrays(0)= 100 ;
    println(newArrays.mkString(","))


    //=====================可变数组=================================
    println("=====================可变数组=================================")
    val arrayBuffer:ArrayBuffer[Int] = ArrayBuffer(1,2,3,4,5,6)

    // 添加一个元素
    arrayBuffer.insert(0,4)
    println(arrayBuffer.mkString(","))

    // 集合首尾添加元素
    // TODO :+ 代表集合增加数据后生成一个新的集合，原来的集合不会改变。
    // TODO +=  在原数据集合上添加一个数据
    val newArrayBuffer:ArrayBuffer[Int] = arrayBuffer:+5
    println(newArrayBuffer == arrayBuffer) //false
    println("arrayBuffer: "+ arrayBuffer.mkString("-"))
    println("newArrayBuffer: "+ newArrayBuffer.mkString("-"))
    //
    val arrayBuffer1 = arrayBuffer+=6
    println(arrayBuffer.mkString(","))  //内容改变了

    println( arrayBuffer== arrayBuffer1) ; // true  说明内存地址是一样的
    println( arrayBuffer == newArrayBuffer) //false
    println(newArrayBuffer == arrayBuffer1) //false
    println("arrayBuffer: "+ arrayBuffer.mkString("-"))
    println("newArrayBuffer: "+ newArrayBuffer.mkString("-"))
    println("arrayBuffer1: "+ arrayBuffer1.mkString("-"))

    //修改元素
    arrayBuffer.update(1,100)
    println("arrayBuffer: "+ arrayBuffer.mkString(","))

    // 删除数据  从1 位置起开始删除，删除3个元素。
    arrayBuffer.remove(1,3)
    println("arrayBuffer: "+ arrayBuffer.mkString(","))

    //删除指定的数据
    arrayBuffer-=6
    println("arrayBuffer: "+ arrayBuffer.mkString(","))

    //查询数据
    for (elem <- arrayBuffer) print(elem+" ");println;

    val unit = arrayBuffer.foreach[Unit]((x)=>print(x*2+" "))
    println;println("arrayBuffer: "+ arrayBuffer.mkString(","))


    //-----------------------------------------
    //将可变数组变成不可变数组
    val array = arrayBuffer.toArray

















  }
}
