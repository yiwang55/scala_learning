package com.yw.scala

trait IsEqual{
  def isEqual(o:Any):Boolean
  def isNotEqual(o:Any):Boolean = !isEqual(o)
}

class Point(xx:Int, yy:Int) extends IsEqual{
    val x = xx
    val y = yy

  override def isEqual(o: Any): Boolean = {
    o.isInstanceOf[Point] && o.asInstanceOf[Point].x == this.x
  }
}
object Yw_Trait2 {
  def main(args: Array[String]): Unit = {
      val p1 = new Point(1,2)
    val p2 = new Point(1,3)
    println(p1.isEqual(p2))
  }
}
