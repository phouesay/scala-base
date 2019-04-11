package day10

import scala.collection.mutable.ArrayBuffer

/*
* 在 Scala 中没有静态方法和静态字段的，但是可以使用object关键字+类名的语法结构实现同样的功能
* 1.工具类，存放常量和工具方法
* 2.实现单例模式
*
* */
object SingletonDemo {

  def main(args: Array[String]): Unit = {
    val factory = SessionFactory

    println(factory.getSessions)
    println(factory.getSessions.size)
    println(factory.getSessions(0))
    println(factory.removeSession)

  }

}

object SessionFactory{

  println("SessionFactory被执行了")
  var i =5

  private val session = new ArrayBuffer[Session]


  while (i>0){
    session += new Session
    i -=1
  }

  def getSessions = session

  def removeSession :Unit ={
    val s = session(0)
    session.remove(0)
    println("session 被移除" +s)
  }
}

class  Session{}