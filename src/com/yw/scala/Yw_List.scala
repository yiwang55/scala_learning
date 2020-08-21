package com.yw.scala

import scala.collection.mutable.ListBuffer

object Yw_List {
      def main(args: Array[String]): Unit = {

        val list = ListBuffer[Int](1,2,3)
        list.append(4,5)
        list.+=:(100)
        list.foreach(println)

//        val list = List[String]("hello scala","hello java","hello spark","a","abc")
//
//        val i: Int = list.count(s => {
//          s.length > 4
//        })
//        println(i)
//        val strings: List[String] = list.filter(s=>{"hello scala".equals(s)})
//        strings.foreach(println)

//        val strings: List[String] = list.flatMap(s => {
//          s.split(" ")
//        })
//        strings.foreach(println)

//    val result: List[Array[String]] = list.map(s => {
//      s.split(" ")
//    })
//    result.foreach(e=>e.foreach(println))


    //    val str = list.+("aaa")
//    println(str)

//    val list = List[String]("a","b","c")
//    list.foreach(println)
  }
}