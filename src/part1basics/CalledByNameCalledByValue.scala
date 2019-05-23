package part1basics

object CalledByNameCalledByValue extends App {
  // Call by value
  // - value is computed before call
  // - same value used everywhere no matter how many times it is called
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  // Call by name
  // - expression is passed literally
  // - expression is evaluated at every use within
  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  // run println twice with value of x
  calledByValue(System.nanoTime())

  // System.nanoTime() method is passed by name, execute by println twice
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  // printFirst(infinite(), 34) // this function will crash

  // this function will not crash
  // infinite() passed by name will not be called until it is needed
  // as it is not needed in printFirst, it is not called.
  printFirst(34, infinite())
}
