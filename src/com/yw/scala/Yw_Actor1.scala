package com.yw.scala

import scala.actors.Actor

/**
 * 给Actor发送消息
 */
class MyActor extends Actor{
  override def act(): Unit = {
    receive{
      case s:String=>println(s"type is String, value is $s")
      case _=>{println("no match")}
    }
  }
}

object Yw_Actor1 {
  def main(args: Array[String]): Unit = {
    val actor: MyActor = new MyActor
    //需要先启动Actor
    actor.start()
    actor.!("hello")
//    actor.send("sending...",)
  }
}
