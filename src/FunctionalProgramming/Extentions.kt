package FunctionalProgramming

//Extention Function
fun Int.printInt(){
    println("Value $this")
}

//Extention Properties
val Int.slice: Int
    get() = this / 2

// nullable reveiver, if the value null it will use 0
val Int?.sliceNull: Int
    get() = this ?: 0 / 3

fun main(args: Array<String>) {
    println(10.slice)

    10.printInt()

    val nullInt: Int? = null
    println(nullInt.sliceNull)
}