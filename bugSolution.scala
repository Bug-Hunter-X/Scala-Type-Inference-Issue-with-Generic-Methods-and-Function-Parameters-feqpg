```scala
class MyClass[T](val value: T) {
  def myMethod(f: T => Boolean): Boolean = {
    f(value)
  }
}

object Main extends App {
  val myInstance = new MyClass(5)
  println(myInstance.myMethod(x => x > 2))

  val myInstance2 = new MyClass("Hello")
  println(myInstance2.myMethod((x: String) => x.length > 3)) // Explicit type annotation for x
}
```