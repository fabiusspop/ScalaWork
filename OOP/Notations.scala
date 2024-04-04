package MyLearningPath.OOP

import scala.language.postfixOps

object Notations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    // def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)

    def unary_! : String = s"$name, helloooo!!!"

    def unary_+ : Person = new Person (name, favoriteMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    def apply(n: Int): String = s"$name watched $favoriteMovie $n times."

    def learns(thing: String) = s"$name is learning $thing"

    def learnsScala = this learns "Scala"

  }

  val person1 = new Person("John", "Serpico")
  println(person1.likes("Serpico"))
  println(person1 likes "Serpico") // equivalent
  // infix notation = operator notation (syntactic sugar)

  // "operators" in Scala
  val person2 = new Person("Jane", "Fight Club")
  // println (person1 hangOutWith person2)
  println(person1 + person2)
  println(person1.+(person2))

  println(1 + 2)
  println(1.+(2))

  // ALL OPERATORS ARE METHODS.
  // Akka actors have ! ?

  // Prefix notation
  val x = -1 // equivalent with 1.unary_-
  val y = 1.unary_-
  // unary_ prefix only works with - + ~ !

  println(!person1)
  println(person1.unary_!)

  // Postfix notation

  println(person1.isAlive)
  //println(person1 isAlive)

  // apply
  println(person1.apply())
  println(person1()) // equivalent


  /*
1. Overload the + operator
    john + "the rockstar" => new person "John (the rockstar)"

2. Add an age to the Person class
   Add a unary + operator => new person with the age +1
   +john => john with age incrementer

3. Add a "learns" method in the Person class => "John learns Scala"
   Add a learnsScala method, calls learns method with "Scala"
   Use it in postfix notation

4. Overload the apply method
   john.apply(2) => "Jane watched Fight club 2 times
 */

  println((person1 + "the Rockstar")())

  println((+person1).age)

  println(person1 learnsScala)

  println(person1(3))



}