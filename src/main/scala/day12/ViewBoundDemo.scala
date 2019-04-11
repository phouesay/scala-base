package day12

/*
* [B <% A] View Bound
* */
class ViewBoundDemo[T <% Ordered[T]] {
  def select(first:T,secound:T) :T={
    if(first >secound) first else secound
  }

}

object ViewBoundDemo{
  def main(args: Array[String]): Unit = {
    import MyPredef.selectGirl

    val viewBoundDemo = new ViewBoundDemo[MyGirl]
    val g1 = new MyGirl("tingting",23,98)
    val g2 = new MyGirl("ningning",44,100)
    val res = viewBoundDemo.select(g1,g2)
    println(res.name)

  }

}
