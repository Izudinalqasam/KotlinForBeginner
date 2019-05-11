package FunctionalProgramming

fun getFullName(first: String, middle: String, last: String){
    println("$first $middle $last")
}

// with the varard keyword, we can also simplify some parameters which have same data type
// Vararg is array, so wae can use array property of function
// in one function we can't use 2 vararg parameter
// if there is more than 1 parameter, vararg parameter has to be placed at the first
fun varargArgument(vararg number: Int) = number.sum()

fun <T> varargWithGenericType(vararg input: T) = input.map { it }

fun varargWithNormalParameter(vararg number: Int, name: String){
    number.forEach {
        print(it)
    }

    println(" By $name")
}

fun varargWithArrayParameter(vararg number: Int){
    number.forEach {
        println("The vararg value is $it")
    }
}

fun main(args: Array<String>) {
    getFullName(middle = "Marco", last = "Kurniadi", first = "Ary")

    println(varargArgument(1, 2, 4))

    val resultGenericVararg = varargWithGenericType("Satu", "dua", "tiga", "empat")
    resultGenericVararg.forEach { println(it) }

    varargWithNormalParameter(1, 2, 3, name = "Marco")

    // to pass array into vararg, don't forget to use * sign before the variabel
    val number = intArrayOf(10, 20, 30, 40)
    varargWithArrayParameter(1, 2, 3, *number, 4, 5, 6)
}