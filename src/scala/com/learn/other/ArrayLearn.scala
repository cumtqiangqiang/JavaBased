package com.learn.other
import  Array._
object ArrayLearn {
  def main(args: Array[String]): Unit = {
    val arr = Array(1.9,2.4,3.4,3.5)
    val arr1 = Array(1.1,2.2,3.3,4.5,5.5)
//    for (ele<- arr){
//      println(ele)
//    }

   println(arr1(1))
    println("-----------------------------")
    val arr2 = concat(arr,arr1)

    for (ele<- arr2){
      println(ele)
    }
  }

}
