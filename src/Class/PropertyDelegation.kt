package Class

import kotlin.reflect.KProperty

// this delegation is only used by variable whose data type String
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal {
    var name: String by DelegateName()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

// ==================================================================================================
// Delegate for all data type by using Any type
class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): Any{
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any){
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class AnimalGenericClass {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

fun main(args: Array<String>) {
    val animal = Animal()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")

    val person = Person()
    person.name = "Dimas"
    println("Nama Orang: ${animal.name}")

    val hero = Hero()
    hero.name = "Gatot Kaca"
    println("Nama Hero: ${hero.name}")

    val animalGeneric = AnimalGenericClass()
    animalGeneric.name = "Dicoding cat"
    animalGeneric.weight = 6.2
    animalGeneric.age = 1

    println("Nama: ${animalGeneric.name}")
    println("Berat: ${animalGeneric.weight}")
    println("Umur: ${animalGeneric.age}")
}