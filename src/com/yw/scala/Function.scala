package com.yw.scala

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
    def fun = (a:Int, b:Int)=>{
      a+b
    }
  }
  }
