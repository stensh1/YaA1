import org.scalatest.funsuite.AnyFunSuite

class ATest extends AnyFunSuite {
  test("defTestsTest") {
    assert(A.setTemperature(10.toByte, 20.toByte, "heat") == 20.toByte)
    assert(A.setTemperature(10.toByte, 20.toByte, "freeze") == 10.toByte)
  }

  test("equalTempTest") {
    assert(A.setTemperature(10.toByte, 10.toByte, "heat") == 10.toByte)
    assert(A.setTemperature(10.toByte, 10.toByte, "freeze") == 10.toByte)
    assert(A.setTemperature(10.toByte, 10.toByte, "auto") == 10.toByte)
    assert(A.setTemperature(10.toByte, 10.toByte, "fan") == 10.toByte)
  }

  test("chgTempTest") {
    assert(A.setTemperature(0.toByte, 10.toByte, "heat") == 10.toByte)
    assert(A.setTemperature(36.toByte, 35.toByte, "freeze") == 35.toByte)
    assert(A.setTemperature(5.toByte, 10.toByte, "auto") == 10.toByte)
    assert(A.setTemperature(10.toByte, 5.toByte, "auto") == 5.toByte)
    assert(A.setTemperature(10.toByte, 45.toByte, "fan") == 10.toByte)
  }

  test("notChgTempTest") {
    assert(A.setTemperature(23.toByte, 18.toByte, "heat") == 23.toByte)
    assert(A.setTemperature(8.toByte, 35.toByte, "freeze") == 8.toByte)
  }

  test("negativeTempTest") {
    assert(A.setTemperature(-10.toByte, -1.toByte, "heat") == -1.toByte)
    assert(A.setTemperature(-10.toByte, 21.toByte, "heat") == 21.toByte)
    assert(A.setTemperature(-10.toByte, 0.toByte, "heat") == 0.toByte)
    assert(A.setTemperature(-8.toByte, 10.toByte, "freeze") == -8.toByte)
    assert(A.setTemperature(-8.toByte, -5.toByte, "freeze") == -8.toByte)
    assert(A.setTemperature(-8.toByte, -15.toByte, "freeze") == -15.toByte)
    assert(A.setTemperature(-10.toByte, -15.toByte, "auto") == -15.toByte)
    assert(A.setTemperature(-10.toByte, -4.toByte, "auto") == -4.toByte)
    assert(A.setTemperature(-16.toByte, -14.toByte, "fan") == -16.toByte)
  }
}
