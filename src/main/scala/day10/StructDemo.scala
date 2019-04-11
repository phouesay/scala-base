package day10


/*
*
* 主构造器的参数列表要放在类名的后面，和类名放在一起
* val 修饰的构造器具有不可变性，var 修饰的构造参数具有可变性
*
* */
class StructDemo(val name :String,var age:Int,faceValue:Int = 90){

  var gender :String =_

  def getFaceValue():Int={
//    faceValue =100 // 此时值是不可更改的，默认是val 修饰的
    faceValue
  }
//  辅助构造器
  def this(name:String,age:Int,faceValue:Int,gender:String){
    this(name,age,faceValue) // 辅助构造器第一行必须先调用主构造器
    this.gender = gender
  }

}

object StructDemo{
  def main(args: Array[String]): Unit = {
    val s = new StructDemo("ningning",26,98,"女")

//    s.name ="tingting" // 无法赋值，因为是用 val 修饰的

    s.age =12

    val faceValue = s.getFaceValue()
    println(s.age)
    println(s.name)
    println(faceValue)
    println(s.gender)
  }
}
