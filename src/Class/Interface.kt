package Class


// it is recommended to put I before interface name
interface IFly {
    fun fly()
    val numberOfWings: Int
}

class concreateInterface(
        override val numberOfWings: Int
) : IFly{
    override fun fly() {
        println("Fly with $numberOfWings Wings")
    }
}

fun main(args: Array<String>) {
    concreateInterface(3)
}