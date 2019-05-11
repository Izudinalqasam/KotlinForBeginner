package ControlFLow


fun checkInstanceOfObject(value: Any){
    when (value){
        is Int -> println("the value has a Int type")
        is String -> println("the value has a String type")
    }
}

fun checkValueInRangeData(value: Int){
    val ranges = 10..50

    when(value){
        in ranges -> println("Value is in the range")
        !in ranges -> println("Value is outside the range")
    }
}

fun getValueFromWhen(regis: Int) = when (regis){
    in 1..50 -> 50 * regis
    in 51..100 -> 100 * regis
    else -> regis
}

fun main(args: Array<String>) {
    println(getValueFromWhen(2))
}