fun main() {
    /*
    OOP let you to create your own data type and avoid DRY (Don't Repeat Yourself)
    Object Oriented Programming
    Class and Object are the main topic we'll discuss
    Class example: a class of fruit ( a class is a template for objects)
    Object example: an apple, a banana, a mango (an object is an instance of a class)
    */
    //Class
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

    var orange = Fruit()
    orange.price = 80000
    orange.taste = "Sour"
    orange.color = "Orange"

    println("Apple price: " + apple.price)
    println("Orange price: " + orange.price)

}