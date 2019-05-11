package DataClassedAndCollection

fun filterNotEample(){
    val masterList = listOf(1, 2, 3, 4,5 ,6, 7, 8, 9, 10)
    val resultFilter = masterList.filterNot {
        it % 2 == 0
    }

    resultFilter.forEach {
        println("the value is $it")
    }
}

fun countWithLamdaExpression(){
    val masterList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val resultList = masterList.count { it % 2 == 0 }

    println("The total of list is $resultList")
}

fun findTheFirstItemOrNull(){
    val masterList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val resultList = masterList.firstOrNull {
        it % 5 == 0
    }

    println("the first item is $resultList")
}

fun findTheLastItemOrNull(){
    val masterList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val resultList = masterList.lastOrNull {
        it % 3 == 0
    }

    println("The last item is $resultList")
}

fun firstAndLast(){
    // if the value is not found it will throw to exception
    val masterList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val firstItem = masterList.first { it > 5}
    val lastItem = masterList.last { it > 5 }

    println("The first item is $firstItem and the last item is $lastItem")
}

fun sortThelist(){
    val masterList = listOf(6, 1, 2, 7, 3, 4, 5 )
    val resultList = masterList.sorted()
    val resultListDescend = masterList.sortedDescending()

    resultList.forEach {
        print(it)
    }
}

fun main(args: Array<String>) {
    sortThelist()
}