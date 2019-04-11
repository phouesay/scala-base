package day14

class Master {

}

object Master{
  val MASTER_SYSTEM= "MasterSystem"
  val MASTER_ACTOR= "Master"

  def main(args: Array[String]): Unit = {
//    如果想要创建Actor，必须先创建它的老大，ActorSystem（单例的）
    val host =args(0)
    val port = args(1).toInt
    val configStr =
      s"""
         | akka.actor.provider ="akka.remote.RemoteActorRedProvider"
         | akka.remote.netty.tcp.hostname ="$host"
         | akka.remote.netty.tcp.port ="$port"
       """.stripMargin
//    val config = ConfigFactory
  }
}
