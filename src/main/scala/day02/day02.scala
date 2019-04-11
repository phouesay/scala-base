package day02

// 数组
object test2{
  def main(args: Array[String]): Unit = {
//    定长数组
    val arr1 = new Array[Int](8)
    println(arr1)

    val arr2 = new Array[String](8)
    println(arr2.toBuffer)
//    不需要 new
    val arr3 = Array("Java","scala","python")
//    取值
    println(arr3(2))

//    变长数组
    import scala.collection.mutable.ArrayBuffer
    val arr4  = ArrayBuffer[Int]()

    arr4 += 1
    arr4 +=(2,3,4)

    arr4 ++=Array(5,6)

//    在下标为0的位置加入 (-1,0)
    arr4.insert(0,-1,0)

//    删除，从下标 2的位置删除2个
    arr4.remove(2,2)
    println(arr4)

    //    循环反向输出
    for(i <-0 until arr4.length reverse) println(arr4(i))

    arr1.sorted


  }
}
