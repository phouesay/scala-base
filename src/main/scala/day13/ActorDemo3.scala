package day13


import scala.actors.{Actor, Future}

class ActorDemo3 extends Actor {
  override def act(): Unit = {
    while (true){
//      偏函数
      receive{
        case "start" =>println("starting...")
        case AsynMsg(id,msg) => {
          println(s"id :$id,AsyncMsg $msg")
          Thread.sleep(2000)
          sender ! ReplyMsg(5,"success")
        }
        case SyncMsg(id,msg) =>{
          println(s"id: $id,SyncMsg : $msg")
          Thread.sleep(2000)
          sender ! ReplyMsg(5,"success")
        }
      }
    }
  }
}

object ActorDemo3{
  def main(args: Array[String]): Unit = {
    val demo3:ActorDemo3 = new ActorDemo3
    demo3.start()
////    异步发送消息，没有返回值
//    demo3 ! AsynMsg(1,"Hi~ Honey")
//    println("没有返回值的异步消息发送完成...")
//
////    同步发送消息，线程等待返回值
//   val content :Any = demo3 !? SyncMsg(2,"Hi~ tingting")
//    println("有返回值的同步消息发送完成...")
//    println(content)

//    异步发送消息，有返回值，返回值类型是Future[Any]
    val reply :Future[Any] = demo3 !! AsynMsg(3,"Hi~ ningning")
    Thread.sleep(3000)
    if(reply.isSet){
      val value = reply.apply()
      println(value)
    }else{
      println("None")
    }


  }
}

//异步
case class AsynMsg(id:Int,msg:String)

//同步
case class SyncMsg(di:Int,msg:String)

case class ReplyMsg(id:Int,msg:String)
