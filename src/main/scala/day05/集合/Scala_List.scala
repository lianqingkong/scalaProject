package day05.集合

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala_List {
  /*
  java  集合：数据的容器 ，可以在内容容纳数据
        list: 有序，可重复
        set:无序，不可重复无
        Map: 无序，存储K-V 键值对，key不可重复

   scala集合：可变集合（ ArrayList）  不可变集合(数组)
    java.int[] ==> scala:Array

    java.list  ==> scala:Seq
    java.set   ==> scala.Set
    java.map   ==> scala.Map
 */
  def main(args: Array[String]): Unit = {
        // java.list  ==> scala:Seq
        //包： immutable 不可变的  ；
        //     mutable 可变的
        // ------------------不可变的 immutable-----------------------------------
        val list:List[Int] = List(1,2,3,4)


        //添加新的元素，得到新的集合
        val newList1 = list:+5
        val newList2 = 5+:list
        println(newList1.mkString("-"))
        println(newList2.mkString("-"))

        //特殊的List集合  Nil=> List()
        val nil = Nil ; //等价于 val nil:List[Nothing] = List();
        //给空集合添加数据
        //方式1
        val newNil = nil:+6:+7:+8
        println(newNil.mkString(","))
        //方式2
        val newNil2 = 6::7::8::nil ; //运算规则是从右向左添加的
        println(newNil2.mkString(","))

        //方式3
        val list3: List[Int] = 5::list        //5 传递到集合中
        val list2: List[Any] = 5::list::Nil  //list 作为一个对象传递进去了。
        val list4: List[Int] = 5::list:::Nil //list 中的值传递进去 将一个整体拆成一个一个的个体，扁平化操作。

        println(list2.mkString(","))
        println(list3.mkString(","))
        println(list4.mkString(","))

        // 修改数据  产生新集合
        val list5: List[Int] = list.updated(1,7)
        println(list5.mkString("-"))

      //反转数据
      val reverse: List[Int] = list.reverse
      println("reverse="+reverse.mkString(","))

      val list6: List[Int] = list.drop(2)  // 去除多少个
      println("list="+list.mkString("-"))
      println("list6="+list6.mkString("-"))
      println(list.tail)  //去除第一个

      //取多少个元素
      val list7: List[Int] = list.take(2)
      println(list7.mkString("-"))

      val tobuffer: mutable.Buffer[Int] = list.toBuffer

        // ------------------可变的  mutable -----------------------------------
        println("------------------可变的  mutable --------------------")
        val listBuffer: ListBuffer[Int] = ListBuffer(1,2,3,4)
        listBuffer.remove(0,2)
        listBuffer.insert(0,1,2)
        listBuffer.update(1,100)
      println(listBuffer.mkString("-"))

      val buffer1: ListBuffer[Int] = listBuffer+=5
      val buffer2: ListBuffer[Int] = listBuffer-=1

      println(listBuffer.mkString(","))
      println(buffer1.mkString(","))
      println(buffer2.mkString(","))

      listBuffer(1) = 2

      for (elem <- listBuffer) {
          print(elem + " ")
      }; println;


      val toList: List[Int] = listBuffer.toList

        //------------------
      val queue= new mutable.Queue[Int]
      queue += 1 ;
      queue += 2 ;
      queue += 3 ;
      queue += 4 ;
      println(queue)
      queue.dequeue()
      println(queue)

      queue.enqueue(11,2,2,3,4,3,2)
      println(queue)






  }

}
