
class Students (var name: String, var ID: String) //constructor outside main function


fun main() {
    //before
    class Fruit {
        //properties
        var price: Int = 0 //has there to be initializer value
        var taste = "" //data type van be declared or not
        var color: String = ""
    }

    //Object
    var apple = Fruit()
    apple.price  = 23000
    apple.taste = "Sweet"
    apple.color = "Red"

    //Using constructor - a simple way of class and object - like parameters
    class Car (var brand: String, var color: String, var price: Int) //class
    val c1 = Car("Toyota", "Red", 200000) //object
    val c2 = Car("Honda", "Blue", 300000)
    println(c1.brand)
    println(c2.brand)

    //anyway did you know we can declare class outside the main function? but only with constructor
    //so any other function could also use it, see line 2
    val s1 = Students("Annisa", "2340605708")
    val s2 = Students("Asep", "2340605709")
    println("Student 1 name: " + s1.name + " ID: " + s1.ID)
    println("Student 2 name: " + s2.name + " ID: " + s2.ID)
}