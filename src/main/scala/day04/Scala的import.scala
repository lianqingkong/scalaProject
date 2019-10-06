package day04

import java.sql.Date
import java.util.{Date=>_}


/**
  * 1) scala 语法源于 java,所以会自动导入 java.lang包中的所有类
  * 2) scala还会自动导入其他的scala包 ,还有伴生对象Predef(其中的方法是静态导入的，可以直接使用里面的方法)。
  * 3) scala如果导入某个包中的所有类，会使用下划线 _ 来代替星号。
  * 4) scala 可以将同个包中的不同类使用花括号封装 import java.util.{HashMap, List}
  * 5)scala 可以给导入的类 起别名，防止误会
  *         import java.util.{HashMap=>JavaHashMap, List}
  *         import java.sql.{Date => SqlDate}
  * 6) scala 可以将不想使用的类给隐藏掉 import java.util.{Date => _ }
  * 7） scala 使用_root_来指定包的绝对路径。解决特殊场合重名的问题。
  *
  *
  */
package test9{
  package java{
    package util{
      class HashMap(){}
    }
  }
  object Scala_root_{
    def main(args: Array[String]): Unit = {
      // 这种形式用的是 相对顶层包 Day04 下的类 。
      new java.util.HashMap () ;  //Day04.test9.java.util.HashMap()

      //如果想使用java.util.HashMap()下的包 需要 _root_ 来指定包名为绝对路径。
      new _root_.java.util.HashMap()
    }
  }
}
object Scala的import {
  def main(args: Array[String]): Unit = {
    new Date(2)
  }

}
