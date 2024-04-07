
//main program by default - the excuted one, the other fun will excecuted only if called by main function
fun main() {
    println("This is main program")
    anotherfunc() //calling the function
    val a = 2
    val b = 3
    val nama = "Moozunch"
    add(a, b)
    greet(nama)
    val yeah = 50
    println(modtwo(yeah))
    val result = minus(10, 5)
    println(result)
}

fun anotherfunc() {
    println("This is another function")
}

//function with paramaters
fun add(x: Int, y: Int){
    println(x+y)
}
fun greet(name: String){
    println("Hello " + name + "!!")
}

//returning value - in pascal and c++ this is actual function while above is procedure(void)
//with returning value, data type of the function is also needed not just parameters - for return
//with return value, the function can be callen using variable in main function or trrough println
fun modtwo(x: Int): Int {
    return (x % 2)
}

//shorter version of function with return value
fun minus(x: Int, y: Int) = x-y



