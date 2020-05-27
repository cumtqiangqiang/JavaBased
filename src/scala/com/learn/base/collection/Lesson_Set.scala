package com.learn.base.collection
import scala.collection.immutable
import scala.collection.mutable
object Lesson_Set {

  def main(args: Array[String]): Unit = {
    val set1 = Set[Int](1,2,3,4)
    val set2 = Set[Int](3,4,5,6)

    val  res1 = set1.intersect(set2)
//    res1.foreach(println)
    // 操作符操作
    val res2 = set1 & set2
//    res2.foreach(println)

    val res3 = set1.diff(set2)
//    res3.foreach(println)

    val res4 = set2.diff(set1)
//    res4.foreach(println)

    val res5 = set1.filter(ele=>{
      ele > 2
    })
//    res5.foreach(println)
    val set3 = mutable.Set[String]("Hello","world")
    set3.+=("Qiang")
    set3.foreach(println)

  }
}
