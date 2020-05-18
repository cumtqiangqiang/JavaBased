package com.learn.base

import java.util.Date

object Lesson_Func {
  def main(args: Array[String]): Unit = {
    /**
     * 1.如果方法体中 返回值使用return，那么方法的返回值类型一定要指定
     * 2.如果没有用return 则返回值类型可以不指定，自动推断
     * 3.参数一定要指定类型
     * 4.如果方法省略等号，则返回空 unit
     * @param x
     * @param y
     * @return
     */
    def max(x:Int,y:Int)={
//      if (x > y ){
//        x
//      }else{
//        y
//      }
      if (x>y) x else  y
    }

    /**
     * 方法体一行 搞定，那么方法体的{} 可以去掉
     * @param x
     * @param y
     * @return
     */
    def min(x:Int,y:Int) = if (x>y) y else x

    val result = max(10,5)
//    println(result)

    val res1 = min(10,5)
//    println(res1)

    /**
     * 递归
     * 递归的时候 要写上返回值类型，调用自己时 无法推断类型
     * @param num
     * @return
     */
    def factorial(num:Int):Int={
      if (num == 1){
        1
      }else{
        num * factorial(num-1)
      }

    }

    val res2 = factorial(3)
//    println(res2)

    /**
     * 默认参数
     * @param a
     * @param b
     * @return
     */
    def fun(a:Int=10,b:Int=20)={
      a+b
    }
    println(fun())

    /**
     * 可变长参数
     * @param s
     */
    def fun1(s:String*): Unit ={
      for (elem<- s){
        println(elem)
      }
    }

    def fun2(s:String*): Unit ={

      //  => 匿名函数
      s.foreach(elem=>{println(elem)})
    }
    def fun3(s:String*): Unit ={

      //  => 匿名函数
//      只有一个参数
//      s.foreach(println(_))
      s.foreach(println)
    }
//    fun3("Hello","World","Boy")

    /**
     * 匿名函数 (作为方法的参数)
     */
    def f = (a:Int,b:Int)=>{
      a+b
    }
    println(f(1,2))

    val sda: String => Unit = (s:String)=>{println(s)}
    sda("Hello")

    /**
     * 方法嵌套
     * @param num
     */
    def fun4(num:Int)={

      def fun(a:Int):Int={
        if (a==1){
          1
        }else{
          a * fun(a-1)
        }
      }
      fun(num)

    }

//    println(fun4(5))

    /**
     * 偏硬用函数
     * 某些情况下方法的参数很多，但调用这个方法非常频繁，每次调用只有固定的参数变化，其他不变，可以定义偏应用函数来实现
     * @param date
     * @param log
     */
    def showLog(date:Date,log:String)={
      println(s"date is $date, log is $log")
    }

    val date = new Date()
//    showLog(date,"aaa")
//    showLog(date,"bbb")
//    showLog(date,"ccc")

   val fun5 = showLog(date,_:String)

//    fun5("ddd")

    /**
     * 高阶函数
     * 1)方法的参数是函数
     * 2）方法的返回是函数 要显示的写出返回值类型(加下划线就不需要了)
     * 3) 方法的参数和返回都是函数
     */
    // 方法的参数是函数
    def highf(a:Int,b:Int):Int = {
      a + b
    }
    def fun6(f:(Int,Int)=>Int,s:String) = {
      val res = f(10,20)
      res + "#" + s
    }
//    val res = fun6(highf,"scala")
    val res = fun6((a:Int,b:Int)=>{a*b},"scala")
//    println(res)

   def fun7(s:String):(String,String)=>String = {

     def fun(a:String,b:String):String={
       a+"=="+b+"#"+s
     }
     fun
//     如果这样写的话 就不需要加返回值类型，可以自动推断,方法转换为函数
//     fun _
   }
//    println(fun7("Hello")("qiang","Fiona"))

    // 方法的参数和返回值都是函数
    def fun8(f:(Int,Int)=>Int):(String,String)=>String={
      val num = f(2,3)
      def fun(a:String,b:String):String={
        a+"@"+b+"="+num
      }
      fun

    }
    val res8 = fun8((a:Int,b:Int)=>{a+b})("Fiona","Qiang")
//    println(res8)

    /**
     * 柯里化函数 (其实就是返回值是函数的高阶函数，高阶函数的简化版)
     */

    def fun9(a:Int,b:Int)(c:Int,d:Int):Int={
      a+b+c+d
    }

    val res9 = fun9(1,2)(3,4)
    println(res9)
  }

}
