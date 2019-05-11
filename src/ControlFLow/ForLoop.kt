package ControlFLow

fun loopRangeIntValueWithStep(until: Int, step: Int){
    val ranges = 1.rangeTo(until) step step

    for (i in ranges){
        println("Step Value is $i")
    }
}

fun loopRangeIntValues(until: Int){
    val ranges = 1.rangeTo(until)

    for (i in ranges){
        println("Value is $i!")
    }
}

fun loopRangeAlphabetValue(until: Char){
    val ranges = 'A'.rangeTo(until) step 5

    for (i in ranges){
        println("character is $i!")
    }
}

fun loopWithIndexAndValue(until: Int){
    val ranges = 1.rangeTo(until)

    for ((index, value) in ranges.withIndex()){
        println("Value $value with index $index")
    }
}

fun forEachWithIndex(until: Int){
    val ranges = 1.rangeTo(until)
    ranges.forEachIndexed { index, i ->
        println("Index $index with the value $i")
    }
}

fun main(args: Array<String>) {
    forEachWithIndex(7)
}