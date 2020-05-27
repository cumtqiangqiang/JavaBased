package com.learn.base.matchlearn

/**
 * case _ 什么也不匹配 放在最后
 * match 可以匹配类型
 * 匹配过程中会有类型的转换
 * 从上往下匹配 匹配后会终止
 * 模式匹配外部括号可以省略，相当于一行代码
 */
object Lesson_Match {
  def main(args: Array[String]): Unit = {
    val tuple = (1,1.2,"abc",'a',true)

    val it =  tuple.productIterator
    it.foreach(MatchTest)


  }

  def MatchTest(o:Any)={
    o match {
      case 1=> println("value is 1")
      case i:Int=> println(s"type is Int,value=$i")
      case d:Double=> println(s"type is Double,value=$d")
      case s:String=> println(s"type is String,value=$s")
      case c:Char=> println(s"type is Char,value=$c")
      case _=> println("no match")
    }
  }
}
