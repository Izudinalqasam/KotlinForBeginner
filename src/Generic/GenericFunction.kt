package Generic

import kotlin.collections.List

fun <T> run(): T {
    return 99 as T
}

fun <T> List<T>.cobaslice(indices: Iterable<Int>): List<T>? {
    return null
}

// Class Generic with restricted, it is called Constraint type parameter
fun <T: Number> List<T>.sumNumber(): T? {
    return null
}

fun main(args: Array<String>) {
    val numbers = (1..100).toList()
    println(numbers.cobaslice<Int>(1..10))
    print(numbers.cobaslice(1..10))
}