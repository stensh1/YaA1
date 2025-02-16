import scala.io.StdIn.readInt

object D extends App {
  val a = readInt()
  val b = readInt()
  val c = readInt()


  def calc(a: Int, b: Int, c: Int): String = {
    if (c < 0) "NO SOLUTION"
    else if (a == 0 && b >= 0 && c * c == b) "MANY SOLUTIONS"
    else if (a != 0 && (c * c - b) % a == 0) s"${(c * c - b) / a}"
    else "NO SOLUTION"
  }

  println(calc(a, b, c))
}
