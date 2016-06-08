package com.foo

import org.scalatest.{AsyncFreeSpec, FlatSpec, FreeSpec, Matchers}



class FooTest extends AsyncFreeSpec with Matchers {

  "A future" - {
    "Should work" in {
      Foo.getNum().flatMap { num =>
        num should be(1)
      }
    }
    
  }

}