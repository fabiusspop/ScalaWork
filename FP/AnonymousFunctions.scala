package MyLearningPath.FP

object AnonymousFunctions extends App{

  // anonymous functions (LAMBDA)
  val doubler: Int => Int = x => x * 2

  // multiple parameters in a lambda
  val adder: (Int, Int) => Int =  (a: Int, b: Int) => a + b

  // no parameters
  val justDoSth: () => Int = () => 3

  println(justDoSth) // function itself
  println(justDoSth()) // call

  // curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // more sintactic sugar

  // val niceIncrementer: Int => Int = (x: Int) => x + 1
  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x + 1

  // val niceAdder: (Int, Int) => Int = (a, b) => a + b
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (a, b) => a + b

  val superAdd = (x: Int) => (y: Int) => x + y

  println(superAdd(3)(4))


}
