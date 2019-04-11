package day12

/*
*  柯里化：把接受多个参数的函数，转变成接收一个参数的函数
* */
object CurryDemo {
  def main(args: Array[String]): Unit = {
    def currying(x:Int)(y:Int) =x*y

    println(currying(3)(4))

    val curryFunc = currying(3)_

    println(curryFunc(5))


    def m1(x:Int,y:Int) =x*y

    println(m1(5,10))

    def m2(x:Int)(implicit  y:Int =5) =x*y

    println(m2(4))

    println(m2(3)(4))
// 注意输出
    implicit val x =100
    println(m2(2))
//  不能添加多个 implicit修饰的变量
//    implicit val y =200
    println(m2(2))

    val arr = Array(("scala",1),("scala",2),("scala",3))
    val res = arr.foldLeft(0)(_+_._2)
    println(res)

//    另一种声明方式
    def curry2(x:Int) =(y:Int) =>x*y

    println(curry2(1)(2))

  }
}
