package ControlFLow


fun rangeDownTo(until: Int){
    val range = 5.downTo(1)
    range.forEach {
        println("Down value is $range")
    }
}

fun rangeUpTo(until: Int){
    val range = 1.rangeTo(5)
    range.forEach {
        println("range value is $range")
    }
}

fun getStepInRanges(until: Int){
    val ranges = 1.rangeTo(until) step 3
    println(ranges.step)
}

fun checkValueInRanges(value: Int){
    val ranges = 1..10
    if (value in ranges){
        println("The Value is available")
    }
}

fun main(args: Array<String>) {
    // simple range
    val simpleRange = 1..5

    checkValueInRanges(7)
}