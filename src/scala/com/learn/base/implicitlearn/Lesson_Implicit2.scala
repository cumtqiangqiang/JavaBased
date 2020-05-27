package com.learn.base.implicitlearn

class Animal(xname:String){
   val name = xname
   def canFly()={
     println(s"$name can fly")
   }
}

class Rabbit(xname:String){
  val name = xname
}
object Lesson_Implicit2 {
  def main(args: Array[String]): Unit = {
    val animal = new Animal("HH")
    animal.canFly

//    不能定义相同类型的隐式转换函数 即 传入和传出一致
    /**
     * 隐式转换函数
     * @param r
     * @return
     */
    implicit  def ra2Animal(r:Rabbit):Animal={
      return new Animal(r.name)
    }
//    implicit  def ra2Ani(r:Rabbit):Animal={
//      return new Animal(r.name)
//    }
    val ra = new Rabbit("Www")
    ra.canFly
  }
}
