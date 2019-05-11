package ControlFLow
enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class ColorWithAnonymousClass(val value: Int){
    RED(0xFF0000) {
        override fun printValue() {
            println("Value of RED is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("Value of GREEN is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("Value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

fun checkEnumInstance(obj: ColorWithAnonymousClass){
    when (obj){
        ColorWithAnonymousClass.BLUE -> {
            println("ControlFLow.Color is Blue")
        }
        ColorWithAnonymousClass.GREEN -> {
            println("ControlFLow.Color is Green")
        }
        ColorWithAnonymousClass.RED -> {
            println("ControlFLow.Color is Red")
        }
    }
}


fun main(args: Array<String>) {
    val varEnum = enumValues<Color>()
    varEnum.forEach {
        println(it)
    }

    val valEnum = enumValueOf<Color>("GREEN")
    println("Selected color is ${valEnum.name}")

    val enumObj = enumValueOf<ColorWithAnonymousClass>("RED")
    enumObj.printValue()

    //get position of enum
    val enumObjPost = enumValueOf<ColorWithAnonymousClass>("GREEN")
    println(enumObjPost.ordinal)

    checkEnumInstance(ColorWithAnonymousClass.RED)
}