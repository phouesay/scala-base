package day09

// 单词计数
object ScalaWordCount {
  def main(args: Array[String]): Unit = {

    val lines = List("hello java hello python","hello scala","hello scala hello java hello scala")

    val word_grouped = lines.flatMap(_.split(" ")).map(x=>(x,1)).groupBy(x=>x._1)

    val word_cnt_1 = word_grouped.map(x=>(x._1,x._2.toList.length))

    val word_cnt = word_grouped.mapValues(_.size).toList.sortBy(_._2).reverse

    println(word_cnt)
  }

}
