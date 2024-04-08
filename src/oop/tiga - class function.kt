
//in Kotlin we can use function inside of class
class car(var brand: String, var model: String, var year: Int) {
    //this is function inside class named drive (class function/member function)
    fun drive() {
        println("Driving the $brand $model")
    }
}
// remember the executed one is the main function, other function only if called
fun main(){
    val c1 = car("Ford", "Mustang", 1969)
    c1.drive()


    //declaration of traditional class in line 42
    student1.name = "Annisa"
    student1.ID = "2340605708"
    student1.height = 160

    //
    println("Student 1 name: " + student1.name + "On test you did " +  student1.grade('A'))
    println("Student 2 name: " + student2.name + "On test you did " +  student2.grade('B')) //input the parameters
}

//also can be with parameters
class Student {
    var name: String = ""
    var ID: String = ""
    var height = 0
    fun grade (gradechar: Char): String{
        //remember when using parameter then we will return something back so using return and don't forget to give the return data type
        return when (gradechar){
            'A' -> "Excellent"
            'B' -> "Good"
            'C' -> "Fair"
            'D' -> "Poor"
            else -> "Fail"
        }
    }
}

var student1 = Student() // the traditional way usually can only be filled inside main function
//except using .apply

var student2 = Student().apply {
    name = "Asep"
    ID = "2340605709"
    height = 170

}


