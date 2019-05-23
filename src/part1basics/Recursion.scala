package part1basics

object Recursion extends App {
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n + " which is " + result)
      result
    }
  println(factorial(10))
  // increase the factorial number (to 5000) to blow up your computer at your own risk

  // use recursive call as the LAST expression
  def anotherFactorial(n: Int): BigInt = {
    //@tailrec // this annotation will make IDE warn you if it is not tail recursive
    def factorialHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else {
        println("Computing factorial of " + x + " with accumulator of " + accumulator)
        val result = factorialHelper(x - 1, x * accumulator) // TAIL RECURSION
        println("Computed factorial of " + x + " with result of " + result)
        result
      }

    factorialHelper(n, 1)
  }
  println(anotherFactorial(25))

  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION

  // Exercise
  // 1. Concatenate a string n times.
  def concat(aString: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else concat(aString, n - 1, aString + accumulator)
  }
  println(concat("hello ", 10, ""))

  // 2. IsPrime function tail recursive.
  def isPrime(n: Int): Boolean = {
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
  }
  println(isPrime(2003))
  println(isPrime(629))

  // 3. Fibonacci function, tail recursive.
  def fibonacci(n: Int): Int = {
    def fibonacciTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fibonacciTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fibonacciTailrec(2, 1, 1)
  }
  println(fibonacci(8))
}
