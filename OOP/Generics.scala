package MyLearningPath.OOP

import java.awt.ContainerOrderFocusTraversalPolicy

object Generics extends App{

  class MyList[+A] {
    // use the type A inside the class definition
    def add[B >: A](element: B): MyList[B] = ???
    /*
    A = Cat
    B = Dog = Animal
     */
  }

  class MyMap[Key, Value]

  val listofIntegers = new MyList[Int]
  val listofStrings = new MyList[String]

  // generic methods
  object MyList{
    def empty[A]: MyList[A] = ???
  } // objects cannot be type parameterized

  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes, List[Cat] extends List[Animal] == COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ??? HARD QUESTION! -> We return a list of Animals.

  // 2. NO = INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  // 3. Definitely NO! = CONTRAVARIANCE
  //class ContravariantList[-A]
  //val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // bounded types
  class Cage[A <: Animal](animal: A) // class Cage only accepts type parameters A which are subtypes of Animal
  val cage = new Cage(new Dog)

//  class Car
//  val newCage = newCage(new Car)

  // expand MyList to be generic


}
