import org.scalatest.funsuite.AnyFunSuite

class BTest extends AnyFunSuite {
  test("defTestsTest") {
    assert(B.isTriangleRequired(3, 4, 5) == "YES")
    assert(B.isTriangleRequired(3, 5, 4) == "YES")
  }

  test("yesTest") {
    assert(B.isTriangleRequired(3, 4, 5) == "YES")
    assert(B.isTriangleRequired(5, 5, 5) == "YES")
    assert(B.isTriangleRequired(7, 10, 12) == "YES")
    assert(B.isTriangleRequired(6, 8, 10) == "YES")
    assert(B.isTriangleRequired(9, 12, 15) == "YES")
  }

  test("noTest") {
    assert(B.isTriangleRequired(1, 2, 4) == "NO")
    assert(B.isTriangleRequired(5, 10, 25) == "NO")
    assert(B.isTriangleRequired(2, 3, 6) == "NO")
    assert(B.isTriangleRequired(1, 1, 3) == "NO")
    assert(B.isTriangleRequired(4, 8, 15) == "NO")
  }
}
