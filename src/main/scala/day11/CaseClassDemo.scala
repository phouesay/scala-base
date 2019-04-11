package day11

import scala.util.Random

/*
* 样例类
* */
object CaseClassDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(CheckTimeOutTask,SubmiTask("1000","task-00001"),HeartBeat(3000))

    arr(Random.nextInt(arr.length)) match {
      case CheckTimeOutTask =>println("CheckTimeOutTask")
      case SubmiTask(prot,name) =>println("submit-task")
      case HeartBeat(time) =>println("Heat-beat")
    }
  }


}

case class HeartBeat(time:Long)
case class SubmiTask(id:String,taskName:String)
case object CheckTimeOutTask
