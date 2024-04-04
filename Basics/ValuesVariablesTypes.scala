package MyLearningPath.Basics

object ValuesVariablesTypes extends App{

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE
  // COMPILER can infer types

  val aString: String = "Hello World!"
  println(aString)

  val aBoolean: Boolean = true
  val aChar: Char = 'c'
  val anInt: Int = x

  println(aBoolean)
  println(aChar)
  println(anInt)

  val aShort: Short = 1000
  println(aShort)

  val aLong: Long = 1000000
  println(aLong)

  val aFloat: Float = 2.0f
  println(aFloat)

  val aDouble: Double = 3.14
  println(aDouble)

  // variables

  var aVariable: Int = 33
  aVariable = 5 // SIDE-EFFECTS




}
