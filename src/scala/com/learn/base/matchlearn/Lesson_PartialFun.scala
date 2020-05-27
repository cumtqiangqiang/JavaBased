package com.learn.base.matchlearn

/**
 * 偏函数 只能匹配一个值，匹配上了返回某个值
 * PartialFunction[A,B] A是匹配的类型 B是返回的类型
 */
object Lesson_PartialFun{
  def MyTest:PartialFunction[String,Int]={
    case "abc"=>2
    case "a" =>1
    case _=> 200
  }

  def main(args: Array[String]): Unit = {
    val res = MyTest("abc")
    println(res)
  }
}
