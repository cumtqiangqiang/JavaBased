package com.learn.base.collection

import scala.collection.mutable.ListBuffer

object Lesson_List {
  def main(args: Array[String]): Unit = {
    val list = List("Hello scala","Hello java","Hello spark")
    val stringses: List[Array[String]] = list.map(s => {
      s.split(" ")
    })
//    stringses.foreach(arr=>{
//      println("----------")
//      arr.foreach(println(_))
//    })


    val strings: List[String] = list.flatMap(s => s.split(" "))
//    strings.foreach(println(_))

    val strings1: List[String] = list.filter(s => {
      // true 的才会留下来,false 的会被过滤
      "Hello scala".equals(s)
    })

//    strings1.foreach(println)

//    可变的List
    val list1 = ListBuffer(1,2,3)
    list1.append(4)
    list1.foreach(println)
  }

}
