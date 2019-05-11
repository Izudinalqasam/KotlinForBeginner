package Class

// change the name class PI to the newest one
// it is useful when we use the two same name but have different package
import kotlin.math.PI as jari_jari


// if you declare the class property as var kotlin will generate getter and setter method by default
// if you declare the class property as val kotlin will generate only the getter

class SimpleAnimal {
    var name = "Dicoding Miaw"
}

class AnimalWithOverrideGetterSetter(){
    var animal = "Dicoding Miaw"
        get() {
            println("Fungsi Getter terpanggil")
            return field
        }
        set(customValue) {
            println("Fungsi Setter terpanggil")
            field = customValue
        }
}

// fungsi init dan primary constructor saling berhubungan
class AnimalWithInitMethod(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if (pWeight<0) 0.1 else pWeight
        name = pName
        age = if (pAge < 0) 0 else pAge
        isMammal = pIsMammal
    }
}

// Extension properties, in this method you have to provide the get method
val SimpleAnimal.infoAnimal: String
    get() = "${this.name} ini tidak mengigit dan sangat mudah dijinakan"


fun main(args: Array<String>) {
    val simpleAnimal = SimpleAnimal()
    println(simpleAnimal.name)
    simpleAnimal.name = "Marco Miaw"
    println(simpleAnimal.name)

    val animalOverride = AnimalWithOverrideGetterSetter()
    println("Nama: ${animalOverride.animal}")
    animalOverride.animal = "Marco Miaw"
    println("Nama: ${animalOverride.animal}")

    println(simpleAnimal.infoAnimal)
}