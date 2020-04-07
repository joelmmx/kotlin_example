fun main() {
    var a: String = "abc"
    //a = null // compilation error
    val l = a.length

    var b: String? = "abc"
    b = null // ok
    print(b)
    //val l1 = b.length // compilation error: variable 'b' can be null
    val l1 = if (b != null) b.length else -1
}