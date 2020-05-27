package com.learn.base.traitlearn

/**
 * trait 不能传参
 */
trait Read{
  def read(name:String)={
    println(s"$name is reading...")
  }
}

trait listen{
   def listen(name:String)={
     println(s"$name is listenging...")
   }
}

class Person extends Read  with listen {

}

object Lesson_Trait1 {
  def main(args: Array[String]): Unit = {
      val p = new Person()
      p.read("Wang ")
  }
}
