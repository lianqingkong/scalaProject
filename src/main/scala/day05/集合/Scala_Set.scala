package day05.集合

import scala.collection.mutable

object Scala_Set {
  def main(args: Array[String]): Unit = {
      //java.set => scala.Set

     //--------------------不可变的set-----------------------------
    val set:Set[Int] = Set(1,2,3,4)

    //获取数据
    println(set.mkString(","))
    //增加数据
    val set1: Set[Int] = set+5
    println(set1.mkString(","))

    //修改数据
    val set2: Set[Int] = set-2
    println(set2.mkString(","))

    //判断 元素 是否存在
    println(set(1))
    println(set.contains(1))

    for (elem <- set) {}
    set.foreach[Unit](println)

     //--------------------可变的set-----------------------------
    val mset = mutable.Set(1,2,3,4)

    // 添加元素
    //+ 号一定会出产生新的集合
    val mset1: mutable.Set[Int] = mset+5
    println(mset1.mkString(","))

    //+= 号不会出产生新的集合
     mset+=5
     mset.add(6)
     val list = List(11,2,3,4)
     println(mset.mkString("-"))
     mset++=list ; //扁平化
    println(mset.mkString("="))


    //修改数据  true 增加数据 ；false 删除数据
    mset.update(7,true)
    mset.update(1,false)
    println(mset.mkString("/"))

    //删除数据
    mset.remove(2)
    mset-=3
    println(mset.mkString(":"))


    println(mset.head)  // 获取头数据
    println(mset.tail)  // 获取尾部数据：除了头 都是尾
    println(mset.last)   // 获取尾数据
    println(mset.init)   // 除了最后一个元素 的所有元素

  }

}
