package day05.集合

import scala.collection.immutable.Map.Map2
import scala.collection.mutable

object 集合常用方法 {
  def main(args: Array[String]): Unit = {
     val list = List(1,12,3,4)
     val set = Set(1,2,3,4)


      //反转
      println("反转"+list.reverse)
      //list求和
      println("sum="+list.sum)
      println("乘积="+list.product)
      // 求最大值
      println("最大值="+list.max)

      // TODO 排序
      //升序排序
      val sorted: List[Int] = list.sorted
      println(sorted)

      // 降序排序
      val sortWith: List[Int] = list.sortWith {
        case (left, right) => {
          left > right  // 左边比右边大
        }
      }
      println(sortWith)
      //使用自定义规则进行排序
      val sortBy: List[Int] = list.sortBy((x)=>{x.toString})
      println(sortBy)

//------------------------------------------------------
      //自定义规则 进行分组
      val groupBy: Map[Int, List[Int]] = list.groupBy(_%2)
      println(groupBy)

       // 转换 映射
       // map方法:将集合中的每一个元素进行转换后放置到新的集合中
        val listMap: List[(Int,Int)] = list.map((_,1))
        println(listMap)

        //扁平化  情景1
        val list2 = List(List(1,2,3), List(4,5), List(6,7))
        println(list2)
        //=>List(1, 2, 3, 4, 5, 6, 7)
         // f: A => GenTraversableOnce[B]
        // 输入参数A：任意数据   输出参数GenTraversableOnce[B]：可迭代的集合  ；
        // 这里  输入：list集合      输出：list集合
        val flatMap: List[Int] = list2.flatMap(x=>x)
        println(flatMap)

       //扁平化  情景2
        val list3 = List(11,12,13,List(1,2,3), 4,5,6)
        println(list3)

        val flatMap3= list3.flatMap(x=>List(x)) //x 需要判断，不是集合就用List包装，否则就不用list包装
        println(flatMap3)

    //----------------------------------------
       // reduce方法  化简折叠
        val list4 = List(1, 2, 3)

        val listReduce: Int = list4.reduce(_+_)//两两结合做运算 相加
        println("listReduce="+listReduce)

        val reduceLeft: Int = list4.reduceLeft((left,right)=>{left + right})
        println("reduceLeft="+reduceLeft)

        val reduceRight1: Int = list4.reduceRight(_+_)
        val reduceRight2: Int = list4.reduceRight(_-_)
        println("reduceRight1="+reduceRight1)
        println("reduceRight2="+reduceRight2)

      //-----------
//      list4.foldRight()
      val fold: Int = list4.fold(1)(_+_)
      println("fold="+fold)
      //应用场景  将两个map合并，相同key的值进行累加，不同的进行增加
       val map1 =  mutable.Map(("a",1),("b",2))
       val map2 =  mutable.Map(("a",2),("c",2))

        map2.foldLeft(map1){
           case (map,(key,value))=>{
             var newValue = map.getOrElse(key,0) + value
             map.update(key,newValue)
             map
           }
        }
       println(map1)


      //过滤
       val list5 = List(1,2,3,4)
       val filter: List[Int] = list5.filter(_%2==0) // 过滤出偶数的
       println("filter="+filter)


  }

}
