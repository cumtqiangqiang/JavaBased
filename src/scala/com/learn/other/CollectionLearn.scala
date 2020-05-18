package com.learn.other

object CollectionLearn {
  def main(args: Array[String]): Unit = {

    val fruit = List("apple","oranges","pears")
    val nums = List(1,2,3,4)
    val ls: List[Any] = fruit:::nums
    println(ls)

    val  ls1 = List.concat(fruit,nums)
    println(ls1)

    val f1: List[String] = fruit.::("banana")
    println("fruit:"+f1)

    println(fruit(1))
}


}
