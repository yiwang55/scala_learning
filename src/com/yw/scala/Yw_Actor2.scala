package com.yw.scala

import scala.actors.Actor

/**
 * actor 之间通信
 *
 */
case class Msg(actor: Actor, message: String){

}

class MyActor1 extends Actor{
  override def act(): Unit = {
    while (true){
      receive{
        case msg:Msg=>
          if("hello~".equals(msg.message))
          {
            println(msg.message)
            msg.actor ! "hi~"
          }else if("have a date?".equals(msg.message)){
            println(msg.message)
            msg.actor ! "no..."
          }
        case _=>{println("no match")}
      }
    }
  }
}

class MyActor2(actor:Actor) extends Actor{

  actor ! Msg(this,"hello~")

  override def act(): Unit = {
    while (true){
      receive{
        case s:String=>          if ("hi~".equals(s)) {
            println(s)
          actor ! Msg(this,"have a date?")
          }else if("no...".equals(s)) {
            println(s)
          }
        case _=>{println("no match")}
      }
    }
  }
}

object Yw_Actor2 {
  def main(args: Array[String]): Unit = {
    val actor1 = new MyActor1
    val actor2 = new MyActor2(actor1)
    actor1.start()
    actor2.start()

  }
}
