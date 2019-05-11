package Generic

// a type whose has same subtype and different argument type related each other
// it is needed when we want to make generic class or function with restrict which will not disturb in the use
abstract class Vehicle(wheel: Int)

class Car(speed: Int): Vehicle(4)
class MotorCycle(speed: Int): Vehicle(2)

fun main(args: Array<String>) {
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle
}