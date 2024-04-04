package MyLearningPath.Basics

import scala.annotation.tailrec

object Recursion extends App{

  def factorial(n: Int): Int = {
    if (n <= 1 ) 1
    else {
      println("Computing factorial of " + n +  " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }
  }

  println(factorial(10))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression
    }

    factHelper(n, 1)
  }

  // println(anotherFactorial(10000))

  // WHEN YOU NEED LOOPS --> USE TAIL RECURSION!

  /*
  1. Concatenates a string n times using tail recursion
  2. IsPrime function tail recursive
  3. Fibonacci function tail recursive
   */

  @tailrec
  def concatenateTailRec(aString: String, n: Int, accumulator: String): String ={

    if (n <= 0) accumulator
    else concatenateTailRec(aString, n - 1, aString + accumulator)
  }

  println(concatenateTailRec("Hello", 3, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(aux: Int, isStillPrime: Boolean): Boolean =
      {
        if (!isStillPrime) false
        else if (aux <= 1) true
        else isPrimeTailRec(aux - 1, n % aux != 0 && isStillPrime)

      }
    isPrimeTailRec(n / 2, true)

  }

  println(isPrime(7))
  println(isPrime(12))

  def fibo(n: Int): Int = {
    @tailrec
    def fiboTailRec(aux: Int, last: Int, nextToLast: Int): Int = {

      if (aux >= n) last
      else fiboTailRec(aux + 1, last + nextToLast, last)

    }

    if (n <= 2) 1
    else fiboTailRec(2, 1, 1)

  }

  println(fibo(8))


}

