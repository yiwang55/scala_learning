package com.yw.scala

trait Read{
  def read(name:String): Unit ={
    println(s"$name is reading....")
  }
}

trait Listen{
  def listen(name:String): Unit ={
    println(s"$name is listening...")
  }
}

class People() extends Read with Listen {

}

object Yw_Trait1 {
  def main(args: Array[String]): Unit = {
    val person: People = new People
    person.read("wangyi")
    person.listen("liyu")
  }
}
