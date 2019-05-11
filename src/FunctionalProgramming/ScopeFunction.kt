package FunctionalProgramming

// there are 2 ways to access the internal obj by scope function that are as lambda receiver (this) and lambda argumen (it).
// lambda receiver is used by run, with, apply
// lambda argument is used by let and with


// Fungsi run akan mengembalikan nilai berdasarkan expression yang berada di dalam blok lambda.
// Fungsi run akan sangat berguna jika di dalam blok lambda terdapat inisialisasi objek dan perhitungan untuk nilai kembalian
fun runScopeExample(){
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }

    println("result: $result")
}

// this is common function. object context was put as argument and from lambda block was accessed as receiver
// this function is suggested to access what become its member without having to provide return value
// this can return value but is not recommended
fun withScopeExample(){
    val message = "Hello Kotlin!"
    val result = with(message){
        println("Value is $this")
        println("with length : ${this.length}")
    }
}

// return value from this function is value from object, and context object is available as receiver
fun applyScopeExample(){
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}

// the use of this function will us find out on the object non-null. using this can reduce the safe call use
fun letScopeExample(){
    val messageNull: String? = null
    val message = "Hello World"

    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }
}

fun letScopeNullValueExample(){
    val message: String? = null

    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }.run {
        val text = "message is null"
        println(text)
    }
}

fun letWithreturnValueExample(){
    val masterMessage = "Hello Kotlin"

    val resultMessage = masterMessage?.let {
        "$it by Izzuddin"
    }

    println(resultMessage)
}

// also function is same with the apply function, the return value is object. but the available context is it.
// this is well to be used when we want to use context from object as argument without having to change its value
fun alsoScopeExample(){
    val txt = "Hello Kotlin"
    val result = txt.also {
        println("Value length _> ${it.length}")
    }

    println(result)
}

fun main(args: Array<String>) {
    alsoScopeExample()
}