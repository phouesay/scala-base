package day07

import scala.collection.mutable

object test07{
  def main(args: Array[String]): Unit = {
    val map1 = new mutable.HashMap[String,Int]()

    map1("scala") =1
    println(map1)

//    注意是双层括号
    map1 +=(("java",2))
    println(map1)

    map1 +=(("python",3),("c#",4))
    println(map1)

    map1 -="python"
    map1.remove("java")
    println(map1)
  }
}