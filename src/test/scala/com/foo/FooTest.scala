package com.foo

import org.scalatest.{AsyncFreeSpec, FlatSpec, FreeSpec, Matchers}

import scala.concurrent._
import ExecutionContext.Implicits.global

object Foo {
  def getNum():Future[Int] = Future(1)
}

class FooTest extends AsyncFreeSpec with Matchers {

  "A future" - {
    "Should work" in {
      Foo.getNum().flatMap { num =>
        num should be(1)
      }
    }
    
  }

}