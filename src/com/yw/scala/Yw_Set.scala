package com.yw.scala
import scala.collection.immutable

object Yw_Set {
  def main(args: Array[String]): Unit = {

    //可变set需要手动导包
//    import scala.collection.mutable.Set
//    val set = Set[Int](1,2,3)
//    set.+=(4)
//    set.foreach(println)

    val ints = immutable.Set[Int](1,2,3)
    val ints1 = ints.+(4)
    ints1.foreach(println)


//    val set = Set[Int](1,2,3,4,4,5)
//
//    val set1 = Set[Int](3,4,4,5,6)
//
//    val ints = set.filter(s=>{s > 2})
//    ints.foreach(println)

//    val set2 = set.diff(set1)
//    set2.foreach(println)
//    val set2 = set.intersect(set1)
//    set2.foreach(println)


//    set.foreach(println)
  }
}
