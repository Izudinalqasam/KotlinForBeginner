package FunctionalProgramming

// function using another function as parameter, return type, or both called as Higher-Order Function
fun simpleLamdaAsParameter(value: Int, sum: (Int) -> Int){
    val result = sum(value)
    println("The result is $result")
}


//lamda with receiver
fun buildString(action: StringBuilder.() -> Unit): String{
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

// use typealias to make lamda as function type
typealias Aritmetic = (Int, Int) -> Int
typealias AritmeticDifferentType = (Int, String) -> String

// function type as nullable
typealias ArithmeticNullable = ((Int, Int) -> Int) ?

fun main(args: Array<String>) {
    var sum = { number: Int -> number + number }

    simpleLamdaAsParameter(4, sum)
    simpleLamdaAsParameter(8){
        it + it
    }

    val message = buildString {
        append("Hello")
        append("from")
        append("lambda")
    }

    println(message)

    // use typealias as function type
    val sumer: Aritmetic = {value1, value2 -> value1 + value2}

    //menggunakan instance by lamda function or operator invoke()
    val sumResult = sumer(10, 10 )
    val sumResultInvoke = sumer.invoke(5, 5)

    println("$sumResult and $sumResultInvoke")

    val sumNullable: ArithmeticNullable = {value1, value2 -> value1 + value2}
    val sumNUllableResult = sumNullable?.invoke(1, 2)

    println(sumNUllableResult)
}