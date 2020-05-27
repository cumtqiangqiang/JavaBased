package com.learn.base.matchlearn

case class Person(name:String,age:Int)
object Lesson_CaseClass {
  def main(args: Array[String]): Unit = {
    val p1 = new Person("Qiang",21)
    val p2 = new Person("Qiang",21)
    println(p1.equals(p2))
    print(p1)
  }
}
