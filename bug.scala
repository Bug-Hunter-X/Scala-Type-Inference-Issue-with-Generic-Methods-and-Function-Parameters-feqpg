```scala
class MyClass[T](val value: T) {
  def myMethod(f: T => Boolean): Boolean = {
    f(value)
  }
}

object Main extends App {
  val myInstance = new MyClass(5)
  println(myInstance.myMethod(x => x > 2)) // Works fine

  val myInstance2 = new MyClass("Hello")
  // println(myInstance2.myMethod(x => x.length > 3)) // Compilation error!
}
```