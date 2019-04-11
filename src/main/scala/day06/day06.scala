package day06

import scala.collection.mutable


// set
object test06{
  def main(args: Array[String]): Unit = {
//    需要先声明
    import scala.collection.immutable.HashSet
    val set1 = new HashSet[Int]()
    val set2 =set1+1
    println(set1)
    println(set2)

    val set3 = set2++Set(7,8,9)
    println(set3)

    import scala.collection.mutable.HashSet

    val set01 = new mutable.HashSet[Int]()
    set01 +=1
    println(set01)
    set01.add(3)
    println(set01)

    set01 ++=mutable.Set(7,8,9)
    println(set01)
//    删除
    set01 -=1
    set01.remove(2)
    println(set01)
  }
}
