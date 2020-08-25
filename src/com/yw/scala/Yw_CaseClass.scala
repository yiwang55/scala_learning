package com.yw.scala

case class Person1(name:String,age:Int)
object Yw_CaseClass {
  def main(args: Array[String]): Unit = {
    val p1: Person1 = new Person1("zs", 18)
    val p2: Person1 = new Person1("zs", 18)
    println(p1.equals(p2))
    println(p1.name)
  }
}
