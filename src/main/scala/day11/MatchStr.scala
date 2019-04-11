package day11

import scala.util.Random

/*
* 匹配字符串
*
* */

object MatchStr{
  def main(args: Array[String]): Unit = {
    val aarr =Array("zhongdonyu","zhengshuang","guanxiaotong","yangzi")

    val name = aarr(Random.nextInt(aarr.length))

    println(name)

    name match {
      case "zhoudongyu" =>println("周冬雨")
      case "yangzi" =>println("杨紫")
      case "zhengshuang" =>println("郑爽")
      case "guanxiaotong" =>println("关晓彤")
      case _=>None
    }
  }

}

/*
* 匹配类型
* */
object MatchType{
  def main(args: Array[String]): Unit = {
    val arr = Array("abcde",101,3.14,true,MatchType)

    val element = arr(Random.nextInt(arr.length))

    println(element)

    element match {
      case str:String =>println(s"")
      case _:Any => println("not match")
    }
  }
}

/*
* 匹配数组，元组，集合
* */
object MatchArray{
  def main(args: Array[String]): Unit = {
    val arr = Array(3,2,5,7)
    arr match {
      case Array(d,a,b,c) => println(s"case: $a,$b,$c")
      case Array(_,x,y) =>println(s"case : $x,$y")
//        不加会出错
      case  _ => println("Not match")
    }
  }

}

/*
* 匹配元组
* */

object MatchTuple{
  def main(args: Array[String]): Unit = {
    val tup =(1,2,3)
    tup match {
      case (2,a,b) => println(s"case $a,$b")
      case _ => println("no match")
    }
  }
}

/*
* 匹配集合
* */

object MatchList{

  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,0)
    list1 match {
      case 0::Nil => print("case1: 0")
//        注意两者之间的区别
//      case a::b::c::d=> println(s"case2: $a,$b,$c,$d")
      case a::b::c::d::Nil => println(s"case2: $a,$b,$c,$d")
      case 0::a =>println(s"case3 : $a")
      case _ => println("no match")
    }
  }

}