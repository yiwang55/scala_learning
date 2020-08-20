package com.yw.scala

import java.util.Date

object Function {
  def main(args: Array[String]): Unit = {
//    def max(a :Int, b:Int) = {
//    if (a > b){
//       a
//    }else{
//       b
//    }
//    }

//def max(a :Int, b:Int) = if (a > b) a else b
//
//    val i = max(100, 20)
//    println(i)

    /**
     * 递归方法
     * 递归函数需要显示指明返回类型
     */
//    def fun(num:Int) : Int  = {
//      if (num ==1){
//        1
//      }else
//        {
//          num * fun(num-1)
//        }
//    }
    /**
     * 参数有默认值的方法
     */
//    def fun(a:Int=10, b:Int=20): Int ={
//      a+ b
//    }
//    print(fun(b=200))
//  }
    /**
     * 可变长参数的方法
     */
//    def fun(s:String*)={
//      s.foreach(e => {
//        println(e)
//      })
//      //      for(e <- s)
////      println(e)
//    }
//    def fun(s:String*): Unit ={
//  s.foreach(println)
//}
//    fun("hello ", "a", " b")
    /**
     * 匿名函数
     */
//    def fun = (a:Int, b:Int)=>{
//      a+b
//    }
//    println(fun(100,200))

    /**
     * 偏应用函数
     */
//    def showLog(date:Date, log:String) ={
//      println(s"date is $date , log is $log");
//    }
//
//    val date  = new Date();
////    showLog(date, "a")
////    showLog(date, "b")
////    showLog(date, "c")
//
//    def fun = showLog(date, _:String)
//    fun("aaa")
//    fun("bbb")
//    fun("ccc")

    /**
     * 高阶函数
     */
    //方法的参数是函数
//    def fun(a:Int,b:Int) : Int = {
//      a + b
//    }
//    def fun1(f:(Int, Int)=> Int, s:String) :String={
//        val i = f(100,200)
//       i+"#"+s
//    }
//
//     val result = fun1((a:Int, b:Int)=>{
//       a*b
//     }, "scala");
//    println(result)

    //方法的返回是函数
//    def fun(s:String) = {
//      def fun1(s1:String, s2:String): String = {
//      s1+ "##" + s2+ "$"+s
//      }
//      fun1 _
//    }
//
//    println(fun("a")("b","c"))

    //方法的返回和参数是函数
//    def fun(f: (Int, Int) => Int) = {
//      val i = f(1, 2)
//
//      def fun1(s1: String, s2: String): String = {
//        s1 + "@" + s2 + "*" + i
//      }
//
//      fun1 _
//    }
//
//    val str = fun((a:Int,b:Int)=>{a+b})("a","b")
//    println(str)

    /**
     * 颗粒化函数
     */
    def fun(a:Int, b:Int)(c:Int, d:Int)={
      a+b+c+d
    }

    println(fun(1,2)(3,4))
  }
  }
