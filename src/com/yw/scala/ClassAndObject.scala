package com.yw.scala

class Person(xname:String, xage:Int){
  val name = xname
  var age = xage
  var gender = 'M'

  println("****** Person Class ********")
  def this(yname:String, yage:Int, ygender:Char){
    this(yname, yage)
    this.gender = ygender
  }
  def sayName(): Unit ={
    println("hello world " + ClassAndObject.name)
  }
  println("======= Person Class ========")
}

object ClassAndObject {
//  println("###### Person Class ######")
  val name = "wang wu"
  def main(args: Array[String]): Unit = {
  /**
   * while
   * do while
    */
//  var

//    val p = new Person("zhangsan",20)
//    println(p.gender)
//    val p1 = new Person("zhangsan",20, 'F')
//    println(p1.gender)

//    for (i <- 1 to 10){
//      println(i)
//    }

    //小九九
//    for (i <- 1 until 10){
//      for (j <- 1 until 10){
//        if (i>=j){
//        print(i + " * " + j + " = " + i*j+ "\t")
//        }
//        if (i ==j){
//          println()
//        }
//      }
//    }

//        for (i <- 1 until 10; j <- 1 until 10){
//            if (i>=j){
//            print(i + "*" + j + "=" + i*j+ "\t")
//            }
//            if (i ==j){
//              println()
//            }
//        }

//    for (i <- 1 to 1000 if (i > 500) if (i % 2 == 0)) {
//      print(i + "\t")
//    }

//    val result = for (i <- 1 to 100 if (i > 50) if (i % 2 == 0)) yield i
//    println(result)
  }
}
