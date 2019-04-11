package day12

object MyPredef {
  implicit def fileToRichFIle(file:String)  = new RichFile(file)

  implicit val selectGirl = (g:MyGirl) =>new Ordered[MyGirl]{
    override def compare(that: MyGirl): Int ={
      if (g.faceValue ==that.faceValue){
        that.age  -g.age
      }else{
        g.faceValue -that.faceValue
      }
    }
  }

  implicit object OrderingGirl extends Ordering[MyGirl]{
    override def compare(x: MyGirl, y: MyGirl): Int ={
      if(x.faceValue ==y.faceValue){
        y.age  -x.age
      }else{
        x.faceValue - y.faceValue
      }
    }
  }

}
