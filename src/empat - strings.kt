fun main() {
    val greeting = "Hi Moozunch!"
    var nama: String //Variable without value need to be declared the type
    nama = "Annisa"
    println(greeting + " " + nama)
    // Since string is an array of characters, ofc we can access every character by indexing, index start from 0
    print(nama[0])
    print(nama[1])
    print(nama[2])
    print(nama[3])
    print(nama[4])
    println(nama[5])

    // String Length
    println("The length of " + greeting + " is " + greeting.length)
    //To Uppercase
    println("Nama to Uppercase " + nama.toUpperCase())
    //To Lowercase
    println("Nama to Lowercase " + nama.toLowerCase())
    //Compare two string wether they are the same
    val nama2 = "Annisa"
    println(nama.compareTo(nama2)) //output 0 if , else random nilai
    //Locate - to find basically
    println(greeting.indexOf("Moozunch")) //start from cound to character 3

    println(greeting + " " + nama)
//    println(greeting.plus(nama)) //Instead of this, try Interpolation/Templates:
    println("WEYOOO $greeting $nama")


}