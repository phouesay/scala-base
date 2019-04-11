package day12

class ContextBoundDemo[T :Ordering] {
  def select(first:T,second:T) :T ={
//    attention
    val ord:Ordering[T] = implicitly[Ordering[T]]
    if(ord.gt(first,second)) first else second

  }
}

object ContextBoundDemo{
  def main(args: Array[String]): Unit = {
    import MyPredef.OrderingGirl

    val contextBoundDemo = new ContextBoundDemo[MyGirl]

    val g1 = new MyGirl("daya",40,90)
    val g2 = new MyGirl("erya",39,80)

    val res = contextBoundDemo.select(g1,g2)
    println(res.name)

  }
}
