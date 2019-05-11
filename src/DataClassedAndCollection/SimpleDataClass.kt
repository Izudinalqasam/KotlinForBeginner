package DataClassedAndCollection

/*
* Rules
* Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter;
* Semua konstruktor utama perlu dideklarasikan sebagai val atau var;
* Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.
*
* */

data class User(val name: String, val age: Int)

fun copyObjectWithModification(fromObj: User): User {
    return fromObj.copy(age = 20)
}

fun copyObject(fromObj: User): User {
    return fromObj.copy()
}

fun main(args: Array<String>) {
    val masterUser = User("Marco", 19)
    val objCopied = copyObject(masterUser)
    val objCopiedModified = copyObjectWithModification(masterUser)

    println(masterUser == objCopied)
    println(masterUser == objCopiedModified)
}