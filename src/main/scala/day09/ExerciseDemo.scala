package day09

object ExerciseDemo {
  def main(args: Array[String]): Unit = {
//    create list
    val list0 = List(2,5,9,6,7,1,8,3,4,0)
//    each elements
    val list1 =list0.map(_*2)
//  将list0中偶数取出，生成一个新的集合
    val list2 =list0.filter(_%2==0)

    val list3 = list0.sorted

    val list4 = list3.reverse

//   将 list0中的元素4个一组，类型为Iterator[List[Int]]
    val it = list0.grouped(4)

//    println(it.toBuffer)

    //    将Iterator转换成List
    val list5 =it.toList
//    println(list5)
//    将多个list压扁成一个list
    val list6 = list5.flatten
//    println(list6)
//    先按空格切分，再压扁
    val lines = List("hello java hello scala","hello scala","hello python")

//    val word_list = lines.map(_.split(" "))
//    val faltWords = word_list.flatten
    val res =lines.flatMap(_.split(" "))
//    并行计算求和
    val arr02 = Array(1,2,3,4,5,6,7,8,9,10)
//    和线程有关，每个线程执行一部分
    val res01 = arr02.par.sum
//    按照特定的顺序进行聚合
//    val res02 = arr02.reduce(_+_)
      val res02 = arr02.reduceLeft(_+_)
//    println(res02)

//  折叠，有初始值（无特定顺序）
    val res03 = arr02.fold(10)(_+_)

    val res03_1 = arr02.par.fold(10)(_+_)
    //  折叠，有初始值（有特定顺序）
    val res04 = arr02.foldLeft(10)(_+_)
    val res04_1 = arr02.par.foldLeft(10)(_+_)
//    聚合
    val list10 = List(List(1,2,3),List(3,4,5),List(2),List(0))

//    val res05 = list10.flatten.reduce(_+_)

    val res06 = list10.aggregate(0)(_+_.sum,_+_)

    val list11 = List(5,4,3,6,7)
    val list12 = List(1,2,3,4)
//    求并集
    val res07 = list11 union list12

//    求交集
    val res08 = list11 intersect list12

//    求差集
    val res09 = list11 diff list12

//    println(res09)
//    word count



  }

}
