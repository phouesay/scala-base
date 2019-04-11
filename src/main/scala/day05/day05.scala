package day05

object Test5{
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3)
//    添加，前面
    val list2 =0::list1
    val list3 = 0 +: list1
    println(list3)
//    添加，后面
    val list6 = list1 :+4
    println(list6)

    val list7 =List(11,22,33)

//    三种集合合并方式
    val list8 =list1 ++ list7
    println(list8)

    val list9 = list1 ++: list7
    println(list9)

    val list10 = list7 ::: list1
    println(list10)

//    可变
    import scala.collection.mutable.ListBuffer

    val list01 =ListBuffer(1,2,3)
    list01 +=10
    println(list01:+4)
    println(list01.append(5))

    val list02 =ListBuffer(11,22,33)
    list01 ++= list02
    println(list01)

//    ++ 方法会生成新的 list，可变的list 使用不可变的方法，会生成新的list
    println(list01 ++ list02)
    println(list01)


  }
}
