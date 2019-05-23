package part1basics

object ValuesVariablesAndTypes extends App {
  // val {name}: {type(can be inferred)} = {a value}
  val x: Int = 42
  println(x)

  // vals are IMMUTABLE
  // this line will upset the compiler because x is already assigned.
  // x = 2

  // compiler can infer types
  val y = 56

  // semi-colon is allowed, but discouraged
  val aString: String = "hello";
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 2344523443235234L
  val aFloat: Float = 2.4f // need `f` at the end else treated as double
  val aDouble: Double = 3.14

  // variables, mutable, strongly discouraged to use `var` in scala.
  var aVariable: Int = 4
  aVariable = 5 // side-effects, variable can be modified

  // Key takeaways
  // - prefer vals over vars
  // - all vals and vars have types
  // - compiler automatically infers types when omitted
}
