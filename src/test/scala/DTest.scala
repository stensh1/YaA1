import org.scalatest.funsuite.AnyFunSuite

class DTest extends AnyFunSuite {
  test("defTestsTest") {
    assert(D.calc(1, 0, 0) == "0")
    assert(D.calc(1, 2, 3) == "7")
    assert(D.calc(1, 2, -3) == "NO SOLUTION")
  }

  test("commonTestsTest") {
    assert(D.calc(1, -1, 2) == "5")
    assert(D.calc(2, 3, 5) == "11")
    assert(D.calc(0, 3, 5) == "NO SOLUTION")
  }

  test("extremeTestsTest") {
    assert(D.calc(1000, 0, 100) == "10")
    assert(D.calc(-1, 100, 0) == "100")
  }

  test("zeroTestsTest") {
    assert(D.calc(0, 4, 2) == "MANY SOLUTIONS")
    assert(D.calc(1, 0, 0) == "0")
  }

  test("rNumSolutionTest") {
    assert(D.calc(2, 3, 1) == "-1")
    assert(D.calc(1, 0, 0) == "0")
  }

  test("complexSolutionTest") {
    assert(D.calc(1, 1, -1) == "NO SOLUTION")
    assert(D.calc(-1, 1, 2) == "-3")
  }

  test("manySolutionTest") {
    assert(D.calc(0, 9, 3) == "MANY SOLUTIONS")
    assert(D.calc(0, 0, 0) == "MANY SOLUTIONS")
  }

  test("noSolutionTest") {
    assert(D.calc(1, 1, -1) == "NO SOLUTION")
    assert(D.calc(2, 3, 1) == "-1")
  }

}
