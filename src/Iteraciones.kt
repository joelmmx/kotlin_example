fun main() {
    var i = 0
    while (i<3){
        println(i)
        i++
    }
    do {
        println(i)
        i++
    } while (i<6)

    for(i in 1 ..10){
        println(i)
    }

    for(i in 1 until 10){
        println(i)
    }

    for(i in 20 downTo  10){
        println(i)
    }

    for(i in 20 downTo  10 step 2){
        println(i)
    }

    val arreglo = arrayListOf("A","B","C","D","E")
    for (c in arreglo)
        println(c)

    for ((index,c) in arreglo.withIndex())
        println("${index+1} $c")
}