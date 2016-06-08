# ScalaTest 3.0.0-RC1 - Bug with ScalaJS 0.6.9
Example repo showing an issue in ScalaTest-3.0.0-RC1 using ScalaJS 0.6.9

To replicate, run 

`sbt test`

This will fail with the following

```
[info] FooTest:
[info] A future
[info] - Should work *** FAILED ***
[info]   java.lang.IndexOutOfBoundsException: 0
[info]   at (https://raw.githubusercontent.com/scala-js/scala-js/v0.6.9/library/src/main/scala/scala/scalajs/runtime/StackTrace.scala:43:51)
[info]   at (https://raw.githubusercontent.com/scala-js/scala-js/v0.6.9/javalanglib/src/main/scala/java/lang/Throwables.scala:12:19)
[info]   at (https://raw.githubusercontent.com/scala-js/scala-js/v0.6.9/javalanglib/src/main/scala/java/lang/Throwables.scala:267:50)
[info]   at (https://raw.githubusercontent.com/scala/scala/v2.11.8/src/library/scala/collection/mutable/ListBuffer.scala:336:28)
[info]   at (https://raw.githubusercontent.com/scalatest/scalatest/v3.0.0-RC1/scalatest.js/target/scala-2.11/src_managed/main/scala/org/scalatest/concurrent/SerialExecutionContext.scala:117:28)
[info]   at (https://raw.githubusercontent.com/scalatest/scalatest/v3.0.0-RC1/scalatest.js/target/scala-2.11/src_managed/main/scala/org/scalatest/concurrent/SerialExecutionContext.scala:111:56)
[info]   at (https://raw.githubusercontent.com/scalatest/scalatest/v3.0.0-RC1/scalatest.js/target/scala-2.11/src_managed/main/scala/org/scalatest/AsyncFreeSpec.scala:2278:16)
[info]   at (https://raw.githubusercontent.com/scala-js/scala-js/v0.6.9/library/src/main/scala/scala/scalajs/runtime/AnonFunctions.scala:20:48)
[info]   at (https://raw.githubusercontent.com/scalatest/scalatest/v3.0.0-RC1/scalatest.js/target/scala-2.11/src_managed/main/scala/org/scalatest/AsyncEngine.scala:448:30)
[info]   at (https://raw.githubusercontent.com/scalatest/scalatest/v3.0.0-RC1/scalatest.js/target/scala-2.11/src_managed/main/scala/org/scalatest/AsyncEngine.scala:434:46)
[info]   ...
```
