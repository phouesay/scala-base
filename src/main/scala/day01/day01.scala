package day01

// 函数式编程，常用语法
object Test1_1{
  def main(args: Array[String]): Unit = {
    val str = "aaa"

    val x = 3

    val y = if (x > 1) 1 else -1

    //    混合返回类型
    val z = if (x < 1) 1 else "error"

    val a = if (x < 1) 1


    for (i <- 1 to 10) {
      println(i)
    }

    for (i <- 1 until 10) {
      println(i)
    }
    //    println(1 to 10)

    val arr = Array("java", "scala", "c#")

    for (i <- arr) {
      println(i)
    }

    //    高级for循环
    for (i <- 1 to 3; j <- 1 to 3 if (i != j)) println(i * 10 + j)

    // yield 把每次循环的值放到 Vector 中
    val res = for (i <- 1 until 10) yield i
    println(res)

    //    方法是方法，函数是函数
    //    方法
    def ml(x: Int, y: Int): Int = x + y

    println(ml(1, 2))

    //    函数（可以作为参数放入方法中  ）
    val f1 = (x: Int, y: Int) => x + y

    println(f1(1, 2))

    def m2(f: (Int, Int) => Int) = f(3, 4)

    val f2 = (x: Int, y: Int) => x * y

    println(m2(f2))

    //    方法转换成函数
    def m3(x: Int, y: Int): Int = x * y

    // 要有空格
    val f3 = m3 _

    println(m2(f3))

    //    隐式转换
    println(m2(ml))

    //    高阶函数
    val func: Int => Int = x => x * x

    println(func(4))

    val new_arr = Array(1, 2, 3, 4, 5, 6)

    new_arr.map(x => func(x))

    def funcOne(x: Int) = x * x

    new_arr.map(x => funcOne(x))

  }



}
