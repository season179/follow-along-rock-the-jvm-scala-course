package part1basics

object TypeInference extends App {
  // compiler can infer types...
  val message = "Hello, world"
  val x = 2
  val y = x + "items" // Int + String = String

  def succ(x: Int) = x + 1 // Int
  def x: Int = "Hello, world" // Expect Int, but assign String, error!

  // where compiler needs help inferring
  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)
  // must specify return type of recursive function
}
