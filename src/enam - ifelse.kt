fun main() {
    //If else masih sama macam c++, dan pakai operator logika
    val x = 20
    val y = 30
    if (x > y) {
        println("x is greater than y")
    } else if (x < y) {
        println("x is less than y")
    } else {
        println("x is equeal to y")
    }

    var greeting: String
    greeting = if (x < 20) "Good day!" else "Good Evening!"
    //when only have one expression, curly brackets optional, look alike ternary operator
    //in Kotlin Else is a MUST when using IF
    println (greeting)
}