import org.scalatest.funsuite.AnyFunSuite

class CTest extends AnyFunSuite {
  test("defTestsTest") {
    assert(C.checkNumbers(C.getDefaultNumRep("8(495)430-23-97"), List(C.getDefaultNumRep("+7-4-9-5-43-023-97"), C.getDefaultNumRep("4-3-0-2-3-9-7"), C.getDefaultNumRep("8-495-430"))) == s"YES\nYES\nNO")
    assert(C.checkNumbers(C.getDefaultNumRep("86406361642"), List(C.getDefaultNumRep("83341994118"), C.getDefaultNumRep("86406361642"), C.getDefaultNumRep("83341994118"))) == s"NO\nYES\nNO")
    assert(C.checkNumbers(C.getDefaultNumRep("+78047952807"), List(C.getDefaultNumRep("+78047952807"), C.getDefaultNumRep("+76147514928"), C.getDefaultNumRep("88047952807"))) == s"YES\nNO\nYES")
  }
}
