import java.util.*

enum class Moneda(val simbolo:String){
    USD("$"),PEN("$/."),ARS("$"),MXN("$"),BOB("\$b"),CLP("$"),COP("$"),PYG("Gs"),UYU("\$U");
    fun formato(monto:Double) = "$simbolo $monto"
}

fun main(){
    println("Hola Kotlin")
    println(suma(1,2))
    println(esMayorDeEdad(17))
    println(esMayorDeEdad(18))

    val nombre = "Juan Perez"
    var edad = 17

    println("Escribe tu nombre")
    val scanner = Scanner(System.`in`)
    val nextLine = scanner.nextLine()
    val name = if (nextLine != "") nextLine else "kotlin"

    println("Hola $name!")

    val persona = Persona("Juan",17)
    println(persona.nombre)
    println(persona.edad)
    persona.edad = 19
    println(persona.edad)
    println(persona.esMayorDeEdad)

    println(Moneda.ARS)

    println(Moneda.BOB.simbolo)
    println(Moneda.PEN.formato(120.9))


}

fun suma(a: Int , b: Int) = a+b

fun esMayorDeEdad(edad:Int) = edad > 17

class Persona(val nombre:String,var edad:Int){
    val esMayorDeEdad : Boolean
        get() = edad >17
}