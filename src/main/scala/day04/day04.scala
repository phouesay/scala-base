package day04

// 元组
object test4{
  def main(args: Array[String]): Unit = {
//    申明
    val t = ("scala","100L",102L,("spark",1))
// 访问，下标从1开始
    println(t._1)
    println(t._4._1)

    val t1,(a,b,c,d) = ("scala","100L",102L,("spark",1))

    println(a)

//    数组中多个元组
    val arr3 = Array(("tingting",24),("ningning",25),("xiaoyueyue",26))
    println(arr3.toMap)

//    拉链操作
    val arr01 =Array("tingting","ningning","xiaoyueyue")
    val arr02 =Array(24,25,26)
    print(arr01 zip arr02)
  }
}
