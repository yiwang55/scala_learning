package com.yw.scala

object Yw_Map {
  def main(args: Array[String]): Unit = {
    val map: Map[String, Int] = Map[String,Int]("a"->100,"b"->200,("c",300),("c",400))
    map.foreach(println)
    //    println(map)
  }
}
