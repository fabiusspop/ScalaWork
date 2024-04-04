package MyLearningPath.Basics

object DefaultArgs extends App{

  def trFact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFact(n-1, n * acc)
  }

  val fact10 = trFact(10)
  val fact11 = trFact(11, 2)


}
