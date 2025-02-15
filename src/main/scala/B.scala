import scala.io.StdIn.readInt

object B extends App {
  val a = readInt()
  val b = readInt()
  val c = readInt()

  def isTriangleRequired(a: Int, b: Int, c: Int): String = {
    if (a + b > c && a + c > b && b + c > a) "YES"
    else "NO"
  }

  println(isTriangleRequired(a, b, c))
}
