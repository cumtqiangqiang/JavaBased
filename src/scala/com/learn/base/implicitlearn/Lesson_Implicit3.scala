package com.learn.base.implicitlearn

/**
 * 隐式转换类 只能定义在类和对象里面
 *
 */

class Rabbit1(xname:String){
  val name = xname

}
object Lesson_Implicit3 {
  // 给一个类添加功能
  implicit class Animal1(r:Rabbit1){
    def showName()={
      println(s"${r.name} is Rabbit")
    }
  }
  def main(args: Array[String]): Unit = {
    val rabbit = new Rabbit1("Hello")
    rabbit.showName()
  }
}
