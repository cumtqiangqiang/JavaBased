package com.learn.base.collection

import scala.collection.mutable

object Lesson_Map {
  def main(args: Array[String]): Unit = {
    val map = Map[String,Int]("a"->100,"b"->200,("c",300),("c",400))
    val v = map.getOrElse("aa",1200)

    //    println(v)
//    val v1 = map.get("a").get
//    println(v1)

    val keys1: Iterable[String] = map.keys

//    keys1.foreach(key=>{
//      val v = map(key)
//      println(s"$key  $v")
//    })

    val map1: Map[String, Int] = Map[String, Int](("a", 1), ("b", 2), ("c", 3))
    val map2: Map[String, Int] = Map[String, Int](("a", 100), ("b", 200), ("c", 300),("d",400))

    val res: Map[String, Int] = map1.++:(map2)
//    res.foreach(println)

    import scala.collection.mutable.Map
    val  map3: mutable.Map[String, Int] = mutable.Map(("a",1))
    map3.put("b",2)
//    map3.foreach(println)
   val stringToInt= map3.filter(tuple => {
      val key: String = tuple._1
      val value: Int = tuple._2
      value == 2
    })
    stringToInt.foreach(println)

  }
}
