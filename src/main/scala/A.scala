import scala.io.StdIn.readLine

object A extends App {
  lazy val sgHeat = "heat"
  lazy val sgFreeze = "freeze"
  lazy val sgAuto = "auto"
  lazy val sgFan = "fan"

  private val bavTemperature = readLine().split(" ").take(2).map(_.toByte)
  private val svMode = readLine()

  def setTemperature(bpTRoom: Byte, bpTCond: Byte, spMode: String): Byte = {
    spMode match {
      case `sgHeat` => bpTRoom.max(bpTCond)
      case `sgFreeze` => bpTRoom.min(bpTCond)
      case `sgAuto` => bpTCond
      case `sgFan` => bpTRoom
      case _ => 0
    }
  }

  println(setTemperature(bavTemperature(0), bavTemperature(1), svMode))
}
