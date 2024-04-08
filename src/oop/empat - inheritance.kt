//Inheritance
//In kotlin we can use class(superclass) for another class(subclass)


//Superclass
open class parentclass{
    val x = 5
}

//subclass
class childclass: parentclass(){
    //subclass with class function
    fun show(){
        println(x)
    }
}

fun main() {
    val obj = childclass() //if you not sure, checked again the lesson before of how to calling a class and using it
    println(obj)
    obj.show()
}