package day12


//object Context{
//  implicit val a="java"
//  implicit val b ="python"
//}

object CurryTestDemo {

  def m1(str:String)(implicit name:String ="scala")={
//    println(str+name)
    str+name
  }



  def main(args: Array[String]): Unit = {

    val func = m1("Hi~") _

    println(func)

    import Context.b

    println(m1("Hi~"))



  }

}
