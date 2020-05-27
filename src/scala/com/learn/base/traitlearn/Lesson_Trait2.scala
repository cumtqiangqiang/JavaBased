package com.learn.base.traitlearn

/**
 * 方法体中方法可实现也可以不实现
 */
trait IsEqule{
  def isEqu(o:Any):Boolean
//  只有一条语句 省略大括号
  def isNotEqu(o:Any):Boolean = !isEqu(o)

}

class Point(xx:Int,yy:Int) extends IsEqule {
  val x = xx
  val y = yy
  override def isEqu(o: Any): Boolean ={
    o.isInstanceOf[Point] && o.asInstanceOf[Point].x == this.x
  }
}
object Lesson_Trait2 {
  def main(args: Array[String]): Unit = {
    val p1 = new Point(1,2)
    val p2 = new Point(2,3)

    println(p1.isEqu(p2))
  }
}
