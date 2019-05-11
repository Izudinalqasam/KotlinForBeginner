package DataClassedAndCollection

/*
* Sequence can be categorized as lazy evolution, lazy operation only will evaluate the needed item
*
* */
fun useSequenceFromList(){
    // it will not execute the map because value doesn't pass the filter until the fifth iteration iw will be mapped, and timed , and print
    val list = (1..100).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it * it }.forEach { println(it) }

}

fun getSequenceByStandardFunction(){
//    Parameter pertama adalah item pertama yang ada di dalam collection. Parameter kedua adalah lambda expression
//    berisi perubahan pada masing-masing item. generateSequence() akan membuat collection sequence secara tak terbatas so use tkae() function

    val sequenceNumber = generateSequence(1){ it + 1}
    sequenceNumber.take(5).forEach { println("The sequece value is $it") }
}

fun main(args: Array<String>) {
    getSequenceByStandardFunction()
}