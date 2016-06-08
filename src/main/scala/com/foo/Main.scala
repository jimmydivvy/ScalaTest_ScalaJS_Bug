package com.foo

import scalajs.js._
import scala.concurrent._
import ExecutionContext.Implicits.global

object Main extends JSApp {

  def main():Unit = {
    println("Hello, World")

    // We specifically use flatMap here to replicate the scenario occuring in ScalaTest
    Foo.getNum().flatMap { res =>
      println("Got Result: " + res)
      Future(())
    }
  }

}