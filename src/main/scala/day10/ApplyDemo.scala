package day10

/*
* apply 方法通常称为注入方法，在伴生对象中做初始化操作
* apply 方法列表不需要和构造器参数列表统一
* unapply 方法通常被称为提取方法，使用unapply方法来提取固定数量的对象
* unapply 方法返回一个序列 option，内部产生一个some对象来存放一些值
* apply 和 unapply方法能被隐式调用
*
* */
class ApplyDemo(val name:String,var age:Int,var faceValue:Int) {

}

object ApplyDemo{

//  注入方法
  def apply(name:String,age:Int,faceValue:Int):ApplyDemo =
    new ApplyDemo(name,age,faceValue)

  def unapply(applyDemo: ApplyDemo): Option[(String, Int, Int)] ={
    if(applyDemo ==null){
      None
    }else{
      Some(applyDemo.name,applyDemo.age,applyDemo.faceValue)
    }
  }
  
}

object ApplyDemoTest{
  def main(args: Array[String]): Unit = {
    val applyDemo = ApplyDemo.apply("jingjing",24,90)
//    模式匹配
    applyDemo match {
      case ApplyDemo("jingjing",age,faceValue) =>println(s"age: $age")
      case _ =>println("No match nothing")
    }
  }
}
