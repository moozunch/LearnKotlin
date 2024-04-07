fun main() {
    //to store mutliple values on a variable with index start from 0
    //arrayOf to create an array
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0]) //accessing array element with index
    cars[0] = "Opel" //changing array elemnt
    println(cars[0])

    //Length / Size (.size
    println("array size of cars: "+ cars.size)

    //check if element exist (in)
    if ("Volvo" in cars){
        println("Volvo exist")
    } else {
        println("Volvo doesn't exist")
    }

    //iterating array
    for (x in cars){
        println(x) //not sure how it is work, let see for loop on next lesson
    }
}