package day03

// 映射
object test3{
  def main(args: Array[String]): Unit = {
    //    申明方式1
    val map1 = Map("scala" -> 1, "java" -> 2, "python" -> 3)

    //    申明方式2
    val map2 = Map(("scala", 1), ("java", 2), ("python", 3))

    println(map2("scala"))

    //    error
    //    map2("scala") =6
    import scala.collection.mutable._
    val map3 = Map(("scala", 1), ("java", 2), ("python", 3))

    map3("scala") = 6
    print(map1.getOrElse("c#", -1))
  }
}
