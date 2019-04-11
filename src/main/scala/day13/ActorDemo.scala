package day13

import scala.actors.Actor

object ActorDemo1 extends Actor{
  override def act(): Unit = {
    for(i <- 1 to 20){
      println("actor1 :"+i )
      Thread.sleep(1000)
    }
  }
}

object ActorDemo2 extends Actor{
  override def act(): Unit = {
    for(i <- 1 to 20){
      println("actor2 :"+i )
      Thread.sleep(1000)
    }
  }
}


object TestActor{
  def main(args: Array[String]): Unit = {
//    启动Actor
    ActorDemo1.start()
    ActorDemo2.start()
  }
}


