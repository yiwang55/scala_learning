package com.yw.scala

object Yw_Map {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.Map
    val map = Map[String,Int]()
    map.put("a",100)
    map.put("b",200)
    map.put("c",250)
    map.foreach(println)
    map.filter()

    //    val map1: Map[String, Int] = Map[String,Int]("a"->1,"b"->2,("c",3),("c",4))
    //    val map2: Map[String, Int] = Map[String,Int]("a"->100,"b"->2,("c",300),("e",500))

    //    val result: Map[String, Int] = map1.++(map2)
//    result.foreach(println)


//    val keys: Iterable[String] = map.keys
//    keys.foreach(s=>{
//      val value = map.get(s).get
//      println(s"key= $s, value = $value")
//    })
//    val value = map.get("aa").getOrElse("not matched")
//    println(value)

    //    map.foreach(println)
    //    println(map)
  }
}
