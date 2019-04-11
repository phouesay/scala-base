package day10

/*
* 申明类时不需要加 public 关键词，默认是public
* 一个类文件可以申明多个类
*
* */
class Persion {
//  scala 中用 val 申明的变量是只读的，相当于只有get 方法，没有set方法
  val id :String = "100"
// scala 中用 val 申明的变量是只读的，相当于只有get又有set 方法
  var name:String =_
//  private 修饰的属性，该属性属于私有变量，只有本类和半生对象才能访问
  private var age :Int =_
//  用private[this] 修饰的属性，该属性属于对象私有变量，只有本类能访问
  private[this] val gender ="男"


}

object Persion{
  def main(args: Array[String]): Unit = {
    val p   = new Persion
    p.name ="ningning"
    p.age =26
    println(p.name)
    println(p.age)
  }

}

object Test1{
  def main(args: Array[String]): Unit = {
    val p = new Persion
    p.name="tingting"
    println(p.name)
  }
}
