class Pokemon(val nombre: String, var hp: Int, val ataque: Int, val defensa: Int, val listaAtaques: Array<Ataque>){
    fun obtenerAtaque(orden:Int) = if(orden < listaAtaques.size) listaAtaques.get(orden) else throw Exception("Orden: ${orden} Invalida. Debe ser un numero menor a: ${listaAtaques.size}")
}

class Ataque (val nombre : String , val poder: Int)
