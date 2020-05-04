package scala.test
//object TestApp 对应的是静态对象
//单例
object TestApp {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val name="Tom"
    val  age = 20
    val d: Double = 99.89
    val salary = d

    printf("姓名：%s 年龄: %d 工资: %.2f\n",name,age,salary)

    val arr = new Array[Int](10)

    var b:Byte = 10
    print(b)
  }
}
