import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine

object C extends App {

  def getDefaultNumRep(spNumber: String): String = {
    val rvPhonePattern = """^(7|8)?(\d{3})?(\d{7})$""".r

    val cleanNumber =  spNumber.replaceAll("[^0-9]", "")
    cleanNumber match {
      case rvPhonePattern(_, code, number) =>
        val svCode = if (code == null) "495" else code
        s"8$svCode$number"
      case _ => ""
    }
  }

  def checkNumbers(spNumberToAdd: String, sapNumberExist: List[String]): String = {
    val saResult: ListBuffer[String] = ListBuffer()
    sapNumberExist.foreach(el => {
        if (el == spNumberToAdd) saResult += "YES"
        else saResult += "NO"
    })
    saResult.mkString("\n")
  }

  val svNumToInsert = getDefaultNumRep(readLine())
  val savNumExist =
    for(i <- 0 until 3)
      yield getDefaultNumRep(readLine())

  println(checkNumbers(svNumToInsert, savNumExist.toList))
}
