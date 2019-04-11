package day08

// lazy，惰性变量，会实现延迟加载
// 惰性变量只能是不可变变量
object lazyDemo01{
  def init(): Unit ={
    println("call init()")
  }
  def main(args: Array[String]): Unit = {
    val property = init() // 没有用lazy修饰
    println("after init()")
    println(property)
  }
}


// lazy，惰性变量
object lazyDemo02{
  def init(): Unit ={
    println("call init()")
  }
  def main(args: Array[String]): Unit = {
    lazy val property = init() // 没有用lazy修饰
    println("after init()")
    println(property)
  }
}
