
val today: String = "Today is Thursday, 4th April 2024" //Variables can also declared outside main or any other function
//Called as top level variable and any function available in this file could use it
var greeting: String = "Hi Moozunch!"

fun main() {
    //two types of variable in kotlin:

    //1. VAL - values cannot be changed
    val pi = 3.14159
    println(pi)

    //2. VAR - general variable
    var sapa = "Hello" // see it changes to comment since we update the content
    sapa = "World"
    println(sapa)


    //Doesn't have to declare the type of variables, but we can do this:
    val suhu: Int = 37; //Semicolon is okay if you want to make it easy to see
    println(today)

    println(greeting)
    greeting = "Hi Annisa!"
    println(greeting)

    //-------------------------------------------
    //Data Types in Kotlin

}