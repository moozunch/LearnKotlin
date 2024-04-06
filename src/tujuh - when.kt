fun main () {
    //When is switch case in c++
    val day = 6
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Error: Days in a week only seven!" //else is a must when using when
    }
    println(result)
}