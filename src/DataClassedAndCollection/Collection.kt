package DataClassedAndCollection

// list is immutable, you can't modified the value
fun listCollectionWithSaveralKind(){
    val manyTypeInOne = listOf('a', "Kotlin", 3, true, User("Bowo", 49))

    for (i in manyTypeInOne.indices){
        println(manyTypeInOne[i])
    }
}

// mutableListOf is list whose value can be modified
fun modifiedListValue(){
    val mutablelistOF = mutableListOf('a', "Kotlin dan java", 5, User("Marco", 45))

    mutablelistOF.add(0, "Powekerja")
    mutablelistOF.forEach {
        println(it)
    }
}

// =================================================================================================================

// set can only save unique value, it can't save duplicate value, if duplicate it the duplicate one will be removed
// item value in set collection can be add and remove but can't be changed
fun setCollectionWithDuplicatevalue(){
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)
}

fun checkValueInSetCollection(value: Int){
    val masterCollection = setOf(1, 2, 3, 4, 5)
    if (value in masterCollection){
        println("Value is available")
    }
}

fun compateSetCollectionWithDifferentOrder(){
    //
    val firstSet = setOf(1, 2, 3, 5, 4)
    val secondSet = setOf(1, 5, 4, 3, 2)

    if (firstSet == secondSet){
        println("Collection set is same")
    }
}

fun gabunganInSetCollection(){
    val firstCollection = setOf(1, 2, 3, 4, 5)
    val secondCollection = setOf(1, 5, 6, 7, 8)

    println(firstCollection.union(secondCollection))
}

fun irisanSetCollection(){
    val firstCollection = setOf(1, 2, 3, 4, 5)
    val secondCollection = setOf(1, 5, 6, 7, 8)

    println(firstCollection.intersect(secondCollection))
}

// =================================================================================================================

//  collection to save data with key-value format.
fun mapCollectionInitialAndAccess(){
    val masterMap = mapOf(
            "jakarta" to "Indonesia",
            "london" to "England",
            "new delhi" to "India"
    )

    println(masterMap["jakarta"])  // if the values is not found, it will result null
    println(masterMap.getValue("jakarta")) // if the values is not found, it will result exception
}

fun extractListKeyFromMapCollection(){
    val masterMap = mapOf(
            "jakarta" to "Indonesia",
            "london" to "England",
            "new delhi" to "India"
    )

    val mapKeys = masterMap.keys
    mapKeys.forEach {
        println(it)
    }
}

fun extractListValuesFromMapCollection(){
    val masterMap = mapOf(
            "jakarta" to "Indonesia",
            "london" to "England",
            "new delhi" to "India"
    )

    val mapValues = masterMap.values
    mapValues.forEach {
        println(it)
    }
}

fun modifyListValueInMapCollection(){
    //you can use mutableMapOf or typecast the mapOf collection to mutableMap
    val masterMap = mapOf(
            "jakarta" to "Indonesia",
            "london" to "England",
            "new delhi" to "India"
    )

    val mutableMasterMap = masterMap.toMutableMap()
    mutableMasterMap.put("washington", "America")
    mutableMasterMap.forEach { t, u ->
        println("$t is capital of $u")
    }
}

fun main(args: Array<String>) {
    modifyListValueInMapCollection()
}