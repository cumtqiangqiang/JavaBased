package com.learn.base.matchlearn

/**
 * 样例类 可以new 可以不new
 * @param name 自动set get 方法，var--修饰set方法
 * @param age
 */
case class Person(name:String,age:Int)
object Lesson_CaseClass {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("Qiang",21)
    val p2 = new Person("Qiang",21)
    println(p1.equals(p2))
    println(p1)
    println(p1.name)
  }
}
