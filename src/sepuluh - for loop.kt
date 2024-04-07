fun main() {
    //for loop using range and empty varible only for iteration
    //kinda look like pascal

    println("for loop using range")
    for (i in 1..10) {
        println("Halo for ke-" + i)
    }

    //for loop with step
    println("for loop using range and step")
    for (i in 1..10 step 2) {
        println("Halo for ke-" + i)
    }

    //for loop with downTo
    println("for loop with downTo")
    for (i in 10 downTo 1) {
        println("Halo for ke-" + i)
    }

    //for loop with downTo and step
    println("for loop using range")
    for (i in 10 downTo 1 step 2) {
        println("Halo for ke-" + i)
    }

    //with array
    println("for loop with array")
    val names = arrayOf("Asep", "Ujang", "Dadang")
    for (i in names){
        println(i)
    }

    //there is no treaditional loop in Kotlin unlike java
}