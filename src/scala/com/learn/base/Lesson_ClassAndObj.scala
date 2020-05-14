package com.learn.base

/**
 * 1、传参一定要指定参数,Object 不能传参,传参的话 apply 方法
 * 2、类中属性默认有getter 和setter 方法
 * 3.类里的变量都是静态的，相当于java里的工具类
 * 4.scala 中 new object 的时候 除了方法（构造方法除外）不执行，其余都会执行
 * 8.伴生类和伴生对象 可以相互访问私有变量
 * @param xname 什么也不加说明是类私有的，如果加上 val p.xname 公有
 * @param xage
 */
class  Person(xname:String,xage:Int){
  private val name = xname
  val age: Int = xage
  var gender = 'M'

  /**
   * 重写构造方法
   * 1.必须调用默认的构造
   */
  def this(yname:String,yage:Int,ygender:Char){
    this(yname,yage)
    this.gender = ygender

  }
  def sayName(): Unit = {
     println("Hello World")
  }

}
object Lesson_ClassAndObj {

  def apply(i:Int): Unit ={
    println("score="+i)
  }


  def main(args: Array[String]): Unit = {
    /**
     * while
     * do While
     */
//    var i = 0
//    while (i<10){
//      i += 1
//      println(s"第 $i 次 尝试")
//    }


    /**
     * for
     */
//    val r = 1.to(10,2)
//    println(r)
//    for (i<- 1 to 10 ){
//      println(i)
//    }

//    for (i<- 1 until 10){
//      for (j<- 1 until 10){
//        if (i >= j){
//          print(i + "*" + j + "="+i*j + "\t")
//        }
//        if (i == j){
//          println()
//        }
//      }
//    }

//    for (i<- 1 until 10;j<- 1 until 10){
//
//        if (i >= j){
//          print(i + "*" + j + "="+i*j + "\t")
//        }
//        if (i == j){
//          println()
//        }
//
//    }

//    for (i<- 1 to 100 if(i>50) if(i%2 == 0)){
//      println(i)
//    }

//    val result = for (i<- 1 to 100 if(i>50) if(i%2 == 0)) yield i
//    println(result)



//    val p = new Person("Tom",21)
////    println(p.name)
//
//    p.sayName()
//
//    val p1 =new Person("Qiang",23,'F')
//    println(p.gender)
//
//    Lesson_ClassAndObj(1000)
  }
}
