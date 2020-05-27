package com.learn.base.implicitlearn

object Lesson_Implicit1 {

  /**
   * 隐式转换值和参数
   * @param age
   * @param name
   */
  //  两个参数，只有一个 隐式转换的，要用科里化 只能写在后面
  def sayName(age:Int)(implicit name:String)={
    println(s"$name is a student age:$age")
  }

  def main(args: Array[String]): Unit = {
//    不能有多个同种类型的,在作用域找 String类型
    implicit val n:String = "Qiang"
    sayName(20)
  }
}
