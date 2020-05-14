package com.learn.base

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

    }
  }




}
