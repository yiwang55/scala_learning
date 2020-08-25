package com.yw.scala

object Yw_Match {
  def main(args: Array[String]): Unit = {
    val tuple: (Int, Double, Boolean, String, Char) = (1, 1.2, true, "abc", 'c')
    val iterator: Iterator[Any] = tuple.productIterator
    iterator.foreach(matchTest)
  }

  def matchTest(o: Any) =
    o match {
      case 1 => println("value is 1")
      case i: Int => println(s"type is Int, value  = $i")
      case d: Double => println(s"type is Double, value  = $d")
      case s: String => println(s"type is String, value  = $s")
      case c: Char => println(s"type is Char, value  = $c")
      case _ => println("no match...")
    }
}
