package day11

object ClassDemo {
  def main(args: Array[String]): Unit = {
    val human = new Human
    println(human.distence)
    println(human.name)
    println(human.fight)
    println(human.run())

  }

}
/*
* 特质
* */

trait Flyable{
//  声明一个没有值的字段
  val  distence:Int
  //  声明一个没有实现的方法

  def fight:String
  //  声明一个有实现的方法
  def fly:Unit={
    println("I can fly")
  }
}

/*
* 抽象类
* */

abstract class Animal{
//  声明一个咩有赋值的字段
  val name:String

//  声明一个没有实现的方法
  def run():String

//  声明一个有实现的方法
  def climb:String ={
    "I can climb"
  }
}


class Human extends Animal with Flyable{
  override val name: String = "张三"

//  重写了抽象类没有实现的方法
  override def run(): String = "I can run "

  override val distence: Int = 1000
//  重写了特质中没有实现的方法
  override def fight: String = "with 棒子"
}

/*
* 当直接用特质时候，用extends
*
* */

class Human_1 extends Flyable{
  override val distence: Int = 1000

  override def fight: String = "with 棒子"
}