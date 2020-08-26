package com.yw.scala

class Rabbit1(xname:String){
  val name = xname
}

object Yw_ImplicitTrans3 {
implicit class Animal(r:Rabbit1){
 def showName()={
   println(s"${r.name} is Rabbit...")
 }
}

  def main(args: Array[String]): Unit = {
    val rabbit: Rabbit1 = new Rabbit1("rabbit")
    rabbit.showName()
  }

}
