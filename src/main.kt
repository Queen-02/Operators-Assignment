fun main() {
    greet("Queen")
    total()
}

//Question one
fun greet(name: String) {
    println("Hello " + name)
    divide(72, 8)

}

//Question two
fun divide(x: Int, y: Int) {
    var div = x/y
    println(div)

}

//Question Three
fun total() {
    var a = 10
    var b = 12
    var c = 3
    var d = 8
    a+=b + c + d
    println(a)

    interest("and ")
}

fun interest(funny: String) {
    var hobby = "Singing "
    println(hobby + funny)

}