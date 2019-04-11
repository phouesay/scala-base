package day13

import scala.actors.{Actor, Future}
import scala.collection.mutable.ListBuffer
import scala.io.Source

object ActorWordCount {
  def main(args: Array[String]): Unit = {
    val path1 = getClass.getClassLoader.getResource("./a.txt").getPath
    val path2 = getClass.getClassLoader.getResource("./b.txt").getPath
    val path3 = getClass.getClassLoader.getResource("./c.txt").getPath
    val files = Array(path1,path2,path3)


//    存放接收到的每个文件的结果数据
    val replys :ListBuffer[Future[Any]] = new ListBuffer[Future[Any]]
//    存放有值的Future里的数据
    val resList= new ListBuffer[Map[String,Int]]
    for(file <-files){
//      val lines:List[String] = Source.fromFile(file).getLines().toList
//      val words:List[String] = lines.flatMap(_.split(" "))
//      val res:Map[String,Int] =words.map((_,1)).groupBy(_._1).mapValues(_.size)
      val task = new TaskDemo
      task.start()

      val reply :Future[Any] = task !! SmTask(file)

      replys +=reply

    }

    while (replys.size>0){
//      过滤每个Future对象，如果是None类型，就过滤掉
      val dones:ListBuffer[Future[Any]] =replys.filter(_.isSet)

      for(done <-dones){
        resList += done.apply().asInstanceOf[Map[String,Int]]
        replys -=done
      }
    }

//    得到全局聚合的数据
    println(resList.flatten.groupBy(_._1).mapValues(_.foldLeft(0)(_+_._2)))


  }

}

class TaskDemo extends Actor{
  override def act(): Unit = {
    while (true){
      receive{
        case SmTask(file) =>{
          val lines:List[String] = Source.fromFile(file).getLines().toList
          val words:List[String] = lines.flatMap(_.split(" "))
          val res:Map[String,Int] =words.map((_,1)).groupBy(_._1).mapValues(_.size)
//          异步发送数据
          sender ! res
        }
      }
    }
  }
}

case class SmTask(val file:String)

