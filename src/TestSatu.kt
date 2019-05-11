import java.util.*
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.properties.Delegates
import kotlin.reflect.KProperty
import kotlin.test.assertEquals
import kotlin.test.assertTrue

fun main(args: Array<String>) {

  val kataTest= "Halllo saya adalah" +
          "Izudin\n"

//  print(kataTest.codePointAt(kataTest.length -1))

  if(-1 != kataTest.toString().indexOf("\n")) {
    println("ada spasi")
  }else{
    print("gak ada spasi")
  }


  val kol = arrayOf("kolin","dani","jaki")
  val mol = arrayOf("kolin", "dani","jaki" )

  var b = kol contentEquals mol
  print("Statsusnya adalah $b")

  val hehol = arrayOf("")
  val kolekTest = listOf("Da","Aku","Kamulo", "kol")
  val kolekDuaTest = kolekTest.flatMap { it.toUpperCase().toList() }


  val collectionExample = kolekTest.dropLast(1)
  val kolekDuaTest2 = kolekTest.fold("Aku", { m,n -> m+" "+n})

  val theList = listOf("one", "two", "three", "four")
  val resultList = theList.dropWhile{ it.length < 4 }

  for (i in collectionExample)
    println(i)

  var kl : Int by Delegates.vetoable(0){
    property, oldValue, newValue ->

    if (newValue > 0)
      print("pengubahan nilai berhasil nilai sekarang adalah $newValue")
    else
      print("Perubahan nilai Gagal nilai sekarang adalah $newValue")
    newValue >0
  }
  kl =  0

  // sublist is used to take based on range, the example 0 - 2, we can compare it also
  val mn = kolekTest.subList(0,2)
          .sortedWith(compareBy {it})
          .withIndex()
          .map { (i, s) ->
            println(i)
            s
          }

//  println(mn)
//    requireFunction(2)


    val pages: List<Pair<String, String>> = listOf(
            "Page1" to "Page 1 subtitle",
            "Page2" to "Page 2 subtitle",
            "Page3" to "Page 3 subtitle",
            "Page4" to "Page 4 subtitle",
            "Page5" to "Page 5 subtitle",
            "Page6" to "Page 6 subtitle",
            "Page7" to "Page 7 subtitle"
    )


    val keyValDat : Pair<String, String>? = pages.first { it.first == "Page5" }
    var k = keyValDat?.toList()
    println(k)


    val listAngka = ArrayList<UserApk>()
    listAngka.add(UserApk("Hasbi",3))
    listAngka.add(UserApk("Ilham", 4))

    println(listAngka.map { it.anak }.sum())
    println(listAngka.sumBy { it.anak })


    // Extention Function
    fun UserApk.Nambah(angka : Int){
        println("Angkanya adalah $angka")
    }

    val atoBoolean = AtomicBoolean()
    atoBoolean.set(true)

    if (atoBoolean.compareAndSet(true, false)){
        println("True is executed")
    }else{
        println("False is executed")
    }

    println(if (!atoBoolean.get()) "usai" else "gk jadi")
}

var tk = 0
fun requireFunction(data: Int){
    require(data < 5){ "Data yang anda masukan have to more than 5" }
    tk = if (data < 3) 2 else 4

    println("ini statementnya")
    assertEquals(4, tk, "Data yang dimasukkan kurang tepat")
}

class DelegateExample<R>{

  operator fun getValue(nothing: Nothing?, property: KProperty<*>): R {
      return property.name.get(0) as R
  }

  operator fun setValue(nothing: Nothing?, property: KProperty<*>, s: R) {
      println(s)
  }

}


data class UserApk(
        val name: String,
        val anak: Int
)