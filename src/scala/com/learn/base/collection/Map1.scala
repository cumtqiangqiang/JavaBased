package com.learn.base.collection

object Map1 {
  def main(args: Array[String]): Unit = {
    val map = Map[String,Int]("a"->1,"b"->2,"c"->3)
    val map1 = Map[String,Int]("a"->2,"d"->4)
    val list = List(1,2,3,4,5,6)

    val res = list.foldLeft(0)(_ + _)
    println(res)

  }

}
