package day10
/*
* 类名前+private[包名]，是指包访问权限，只能被
* 构造器参数列表前+private是指伴生对象的权限，只有伴生对象能访问
* */
private[day10] class PrivateDemo private (val gender:Int,var faceValue:Int){
//  字段前+private，此时字段称为私有字段
  private val name ="jingjing"
//  字段前+private[this]，表示只能在本类访问
  private[this] var age =24

  private def sayHello() :Unit ={
    println(s"jingjing's age is $age")
  }


}

object PrivateDemo{
  def main(args: Array[String]): Unit = {
    val privateDemo = new PrivateDemo(0,90)
    privateDemo.sayHello()
  }

}

object PrivateDemoTest{
  def main(args: Array[String]): Unit = {
//    error
//    val privateDemo = new PrivateDemo(0,90)
//    println(privateDemo.gender)
  }
}
