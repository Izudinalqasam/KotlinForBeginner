package ControlFLow

fun breakLablel(){
    loop@ for (i in 1..10){
        println("Outside loop")

        for (j in 1..10){
            println("Inside loop")
            if (j > 5) break@loop
        }
    }
}

fun main(args: Array<String>) {
    // way to break in there are nested loop
    breakLablel()
}