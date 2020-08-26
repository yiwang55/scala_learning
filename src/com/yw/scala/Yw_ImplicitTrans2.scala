package com.yw.scala

class Animal(name: String) {
  def canFly(): Unit = {
    println(s"$name can fly...")
  }
}

class Rabbit(xname: String) {
  val name = xname
}

object Yw_ImplicitTrans2 {
  implicit def rabbitToAnimal(o: Rabbit): Animal = {
    new Animal(o.name)
  }

  //不能相同参数返回类型存在
//  implicit def rToAnimal(o: Rabbit): Animal = {
//    new Animal(o.name)
//  }

  def main(args: Array[String]): Unit = {
    val rabbit: Rabbit = new Rabbit("rabbit")
    rabbit.canFly()
  }
}
