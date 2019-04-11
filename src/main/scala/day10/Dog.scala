package day10

/*
*
*
* */
class Dog {
  private var name ="二哈"

  def printName():Unit ={
//    在 Dog类中访问其半生对象的私有属性
    println(Dog.CONSTANT+name)
  }

}

object Dog{
  private  val CONSTANT="汪汪汪..."

  def main(args: Array[String]): Unit = {
    val p = new Dog
//    访问类中的私有name
    println(p.name)
    p.name ="大黄"

    p.printName()
  }

}
