package Generic

interface List<T> {
    operator fun get(index: Int): T
}

class LongList : List<Long> {
    override fun get(index: Int): Long {
        return 1L
    }
}

class ArrayList<T>: List<T>{
    override fun get(index: Int): T {
        return 90 as T
    }
}

// Class Generic with restricted, it is called Constraint type parameter
class ListNumber<T: Number>: List<T>{
    override fun get(index: Int): T {
        return 90 as T
    }
}

// Covariant (out)
// value from the parameter type can only be produced like making it as return type
// it can't be consumed like making it as argument type for all function in the class
interface ListCovariant<out P>: Collection<P> {
    operator fun get(index: Int): P
}

// contravariant (in)
// value from the parameter type can be consumed with making it as argument for all function in the class
// it can't be produced
interface ComparableContra<in T>{
    operator fun compareTo(other: T): Int
}

fun main(args: Array<String>) {
    val dataList = ArrayList<Long>()
    val dataIndexOf = dataList[0]
}