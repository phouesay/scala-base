package day12

/*
* 上界 upper bound
* */
class UpperBoundDemo[T <:Comparable[T]] {
  def select(first: T, second: T): T = {
    if (first.compareTo(second) > 0) first else second
  }
}

object UpperBoundDemo{
  def main(args: Array[String]): Unit = {
   val u =  new UpperBoundDemo[MissRight]
    val m1 = new MissRight("ningning",98)
    val m2 = new MissRight("tingting",120)
   val res = u.select(m2,m1)
    println(res)

  }
}


class MissRight(val name:String,val faceValue:Int) extends Comparable[MissRight]{
  override def compareTo(o: MissRight): Int = {
    this.faceValue -o.faceValue
  }
}
