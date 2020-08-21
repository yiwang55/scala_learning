package com.yw.scala

import scala.collection.mutable.ArrayBuffer

object Yw_Array {
  def main(args: Array[String]): Unit = {
//    val arr = Array[String]("a","b","c","d");

    val arr = ArrayBuffer[Int](1,2,3)
    arr.+=(4) //尾部添加，相当于数组push方法
    arr.+=:(5) //头部添加，相当于数组unshift方法
    arr.foreach(println)


//    val arr1 = Array[String]("e","f","g","h");
//
//    val strings = Array.fill(5)("hello")
//    strings.foreach(println)

//    val strings = Array.concat(arr,arr1)
//    strings.foreach(println)

//    val array = new Array[Array[Int]](3)
//
//    array(0) = Array[Int](1,2,3)
//    array(1) = Array[Int](4,5,6)
//    array(2) = Array[Int](7,8,9)
//
//    array.foreach(e=> e.foreach(println))

//    val arr1 = new Array[Int](3)
//    arr1(0) = 100
//    arr1(1) = 100
//    arr1(2) = 100
//    arr1.foreach(println)
    //    arr.foreach(println)
  }
}

