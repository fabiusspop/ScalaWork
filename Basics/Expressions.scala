package MyLearningPath.Basics

object Expressions extends App{

  val x = 1 + 2 // expression
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  println(!(1 == x))

  var aVariable = 2
  aVariable += 3 //side-effect
  println(aVariable)

  // Instructions (DO) VS Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  } // NEVER WRITE THIS AGAIN!!!!!!!!!!!

  // EVERYTHING in Scala is an EXPRESSION!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code Blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello!" else "Goodbye!"
   }

}
