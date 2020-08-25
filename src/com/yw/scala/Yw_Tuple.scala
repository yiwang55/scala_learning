package com.yw.scala

object Yw_Tuple {
  def main(args: Array[String]): Unit = {
    val tuple1: Tuple1[String] = new Tuple1("hello")
    val tuple2: (String, Int) = new Tuple2("a",100)
    val tuple3: (Int, Boolean, Char) = new Tuple3(1,true,'C')
    val tuple4: (Int, Int, String, Boolean) = Tuple4(1,5,"abc",false)
    val tuple5: (Int, Int, Int, Int, Int, String) = (1,2,3,4,5,"abc")
    //元组最长22个
//    val unit: Unit = (1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1)



    //遍历

//    val iterator: Iterator[Any] = tuple5.productIterator
//    iterator.foreach(println)
    //    while (iterator.hasNext){
//      println(iterator.next())
//    }
  }
}
