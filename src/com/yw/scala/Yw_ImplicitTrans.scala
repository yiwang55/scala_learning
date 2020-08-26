package com.yw.scala

object Yw_ImplicitTrans {
//  def sayName(implicit name:String): Unit ={
//    println(s"$name is developer")
//  }
def sayName(age:Int)(implicit name:String): Unit ={
  println(s"$name is developer, age is $age")
}
  def main(args: Array[String]): Unit = {
    implicit val name:String = "zs"
//    sayName("lisi")
    sayName(28)
  }
}
