import kotlin.reflect.typeOf

val today: String = "Today is Thursday, 4th April 2024" //Variables can also declared outside main or any other function
//Called as top level variable and any function available in this file could use it
var greeting: String = "Hi Moozunch!"

fun main() {
    //variable names should be start with lowercase
    //two types of variable in kotlin:

    //1. VAL - values cannot be changed
    val pi = 3.14159
    println(pi)

    //2. VAR - general variable
    var sapa = "Hello" // see it changes to comment since we update the content
    sapa = "World"
    println(sapa)


    //Doesn't have to declare the type of variables since Kotlin smarts already, but we can do this:
    val suhu: Int = 37; //Semicolon is okay if you want to make it easy to see
    println("Human normal body temperature is  " + suhu)
    println(today)

    println(greeting)
    greeting = "Hi Annisa!"
    println(greeting)

    //-------------------------------------------
    //Data Types in Kotlin

    // 1. String - text between ""
    val x: String = "halo"
    println(x)
    // var y: String = null //cannot be null or empty by default, if i want to create null value and fill it later on try this:
    var y: String? = null
    print("From " + y)
    y = " to NAJEWNONACN"
    println(y)
    println("The value of y is: $y") //another way instead of using +

//    study case:
//    var huh = "hai"
//    huh = 27
//    println(huh) // will get an error since once we declare it as a string or any data type and when we reuse it we can


    // 2. Numbers
    // 2.1 Byte (-128 to 127)
    val numByte: Byte = 25
    println ("Byte example: " + numByte)
    // 2.2 Short (-32768 to 32767)
    val numShort: Short = 4560
    println ("Short example " + numShort)
    // 2.3 Integer (-2147483648 to 2147483647)
    val numInt: Int = -8769533
    println ("Integer example " + numInt)
    // 2.4 Long Integer (-9223372036854775807 to 9223372036854775807)
    val numLong: Long = 9310913746832
    println ("Long example " + numLong)
    //for undefined type such of long or just int it will see how large the number then set up the type
    val akhirInt = 2147483647
    println(akhirInt::class)
    val awalLong = 2147483648
    println(awalLong::class)

    // 3. Floating type
    // 3.1 Float - precisin point only up to 6-7
    val numFloat: Float = 5.75F //we should end the value og a float with the type of an "F"
    println(numFloat)
    // 3.2 Double - precision point more than 7
    val numDouble: Double = 19.99
    println(numDouble)
    // 3.3 Float and Double with scientific number (e/E = power to 10)
    val maNum1: Float = 35e3F
    val maNum2: Double = 12E4
    println (maNum1)
    println (maNum2)

    // 4. Boolean - True/False (logic and relation operator)
    val isKolinFun: Boolean = true
    val isFishTasty: Boolean = false
    print(isKolinFun.toString() + " ") //ubah ke strinng beacuse when i add + after boolean it gives an error
    println(isFishTasty)

    // 4. Character (cannot use ASCII unlike java)
    val myGrade: Char = 'A' //only one petik
    println(myGrade)

//    Study Case 2
//    val a: Int = 5
//    val b: Long = a
//    println(b)
    // do this instead:
    val a: Int = 5
    val b: Long = a.toLong()
    println(b)

}