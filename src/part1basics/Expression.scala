package part1basics

object Expression extends App {
  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= these are all side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)
  // instructions are executed(think Java), expressions are evaluated(Scala)
  // in Scala, think in terms of expressions

  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // IF expression
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)

  // WHILE loop, NEVER WRITE THIS!
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // EVERYTHING in Scala is an Expression!
  val aWeirdValue = aVariable = 3 // returns an `Unit` which is equivalent to a `void`
  println(aWeirdValue) // prints `()`
  // re-assigning a value is a side effect,
  // side effects are expressions returning units
  // while loops are side effects, they return units
  // examples of side effects:
  // println(), whiles, reassigning of vars

  // Code blocks
  // 1. is an expression, value of the block is the value of its last expression
  // 2. is scoped
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // Exercise
  // 1. what is the difference between "hello world" vs println("hello world")?
  // answer: "hello world" is a string literal, returns a String
  // println("hello world") is an expression, has side effect of printing "hello world" to the console,
  // and returns a Unit

  // 2.
  val someValue = {
    2 < 3
  }
  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }
  // answer: 42
}
