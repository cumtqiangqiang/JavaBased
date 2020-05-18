package com.learn.base.collection

import scala.collection.mutable.ArrayBuffer

object Lesson_Array {
  def main(args: Array[String]): Unit = {
    val arr = Array("a","b","c","d")
//    arr.foreach(println)
    val arr1 = new Array[Int](3)
    arr1(0) = 1
    arr1(1) = 2
    arr1(2) = 3

    val arr2 = Array("e","f")
    val arrs = Array.concat(arr,arr2)
//    arrs.foreach(println)

    val arr3 = Array.fill(3)("Hello")
//    arr3.foreach(println)

//    使用可变数组 默认不可变
    val arr4 = ArrayBuffer[Int](1,2,3)
    arr4.append(4,5)
// 在头添加
    arr4.+=:(6)

//尾部加
    arr4.+=(7)
    arr4.foreach(println)



  }
}
