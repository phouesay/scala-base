package day11

/*
* 偏函数PartialFunction[A,B] ,A是输入类型，B是返回类型
* 偏函数PartialFunction常用作输入模式匹配
*
* */
object PartialFunctionDemo {
//  String -> 参数类型
//  Int -> 返回值的类型
  def m1:PartialFunction[String,Int] ={
    case "one" =>{
      println("case 1")
      1
    }
    case "two" =>{
      println("case 2")
      2
    }
  }


  def m2(num:String) :Int =num match {
    case "one" =>1
    case "two" =>2
    case _ =>0
  }

  def main(args: Array[String]): Unit = {
    println(m1("one"))
    println(m2("two"))
  }

}
