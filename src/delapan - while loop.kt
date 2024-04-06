fun main () {
    //remember while loop as long as the condition is true
    //the code still the same as c++

    var x = 1
    while (x < 20) {
        if (x % 2 != 0) {
            x++
            continue
        }
        println("Halo while ke-" + x)
        x++
    }

    //Do while minimum executed once, then be checked
    var y = 1
    do {
        println("Do while ke-" + y)
        y++
        if (y > 5) {
            break //stop all the loops even tho it's not supposed to be stop
        }
    } while (y < 10)
}