
fun convertirANuevosSoles(monto:Double,moneda: Moneda) = when(moneda){
    Moneda.USD -> monto * 3.4
    Moneda.PEN -> monto
    Moneda.ARS -> monto * 4.7
    Moneda.MXN -> monto * 5.97
    Moneda.BOB -> monto * 2.04
    Moneda.CLP -> monto * 192.21
    Moneda.COP -> monto * 882.20
    Moneda.PYG -> monto * 1713.43
    Moneda.UYU -> monto * 8.40
}

fun obtenerLaRegionDeLaMoneda(moneda: Moneda) = when(moneda){
    Moneda.USD,Moneda.MXN -> "Norteamerica"
    Moneda.PEN ,Moneda.ARS ,

    Moneda.BOB ,
    Moneda.CLP ,
    Moneda.COP ,
    Moneda.PYG ,
    Moneda.UYU -> "Sudamerica"
}

fun main(args:Array<String>){
    println(convertirANuevosSoles(500.0,Moneda.MXN))
    println(obtenerLaRegionDeLaMoneda(Moneda.MXN))
    println(obtenerLaRegionDeLaMoneda(Moneda.UYU))
    println(obtenerLaRegionDeLaMoneda(Moneda.USD))

}