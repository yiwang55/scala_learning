package com.yw.scala

/**
 * 偏函数
 */
object Yw_PartialFun {
  def MyTest:PartialFunction[String, Int]={
    case "abc"=>2
    case "a"=>1
    case _ =>2
  }
  def main(args: Array[String]): Unit = {
    println(MyTest("abc"))
  }
}
