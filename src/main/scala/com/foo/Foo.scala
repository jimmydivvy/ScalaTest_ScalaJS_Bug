package com.foo

import scala.concurrent._
import ExecutionContext.Implicits.global

object Foo {
  def getNum():Future[Int] = Future(1)
}