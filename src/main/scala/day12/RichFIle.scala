package day12



import scala.io.Source

class RichFile(val file:String){

  def read():String = {
    Source.fromFile(file).mkString("")
  }
}


object RichFile{
  def main(args: Array[String]): Unit = {
//    part-01
    //    val properties = new Properties()
    //    val in = this.getClass().getClassLoader().getResourceAsStream("a.txt");

//    part-02
    //    val lines = Source.fromURL(getClass.getResource("/a.txt")).getLines()
    //    lines.foreach(println)

//    part-03
//        val path = getClass.getResource("/a.txt").getFile

//    这个过程是显式的实现了read方法
//    val path = getClass.getClassLoader.getResource("./a.txt").getPath
//    val content:String = new RichFile(path).read()
//    println(content)

//    隐式的实现read方法（隐式转换）
    import  day12.MyPredef.fileToRichFIle
    val path = getClass.getClassLoader.getResource("./a.txt").getPath
    val context = path.read()
    println(context)



  }
}
