package fintech.lesson05.examples

object Example30MatchError extends App {

  trait Shape
  case class Circle(r: Double) extends Shape
  case class Square(x: Double) extends Shape

  def printShape(s: Shape): Unit = s match {
    case Circle(r) => println(s"r = $r")
    case Square(x) => println(s"x = $x")
    case _ => println("Not a known shape")
  }

  val s: Shape = Circle(13)
  printShape(s)

//  val unknownShape = new Shape {}
//  printShape(unknownShape)
}
