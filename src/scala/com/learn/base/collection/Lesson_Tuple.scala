package com.learn.base.collection

/**
 * 元组可以用new 也可以不用 甚至可一直接用()
 */
object Lesson_Tuple {
  def main(args: Array[String]): Unit = {
    val tuple = new Tuple2[String, Int]("a", 100)
    val t3: (Int, Int, Int) = (1,2,3)

//    元素翻转 只有tuple2 有这个方法
    println(tuple.swap)
    println(t3)
    val iter = t3.productIterator
    iter.foreach(println)
//     while (iter.hasNext){
//       println(iter.next())
//     }
  }
}
