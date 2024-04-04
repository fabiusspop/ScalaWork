package MyLearningPath.Basics

object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("Hello", 3))

  // WHEN YOU NEED LOOPS, USE RECURSION!
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a:Int, b: Int) = a + b

    aSmallerFunction(n, n-1)
  }

  /*
  1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
  2. Factorial function of n
  3. A Fibonacci function
      f(1) = 1
      f(2) = 1
      f(n) = f(n-1) + f(n-2)
  4. Tests if a number is prime
   */

  def greetings(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old. "
  }
  println(greetings("John", 11))

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n-1)
  }
  println(factorial(4))

  def fibo(n: Int): Int = {
    if (n <= 2) 1
    else fibo(n - 1) + fibo(n - 2)
  }

  println(fibo(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(aux: Int): Boolean = {
      if (aux <= 1) true
      else n % aux != 0 && isPrimeUntil(aux - 1)
    }

    isPrimeUntil(n / 2)
  }

  println(isPrime(6))
}
