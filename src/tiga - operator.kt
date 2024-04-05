fun main(){
    // 1. Arithmetic Operators
    println(100 + 50)
    println(100 - 50)
    println(100 * 50)
    println(100 / 50)
    println(100 % 50)
    var x = 100
    println(x++)
    println(x--) //hasil 101 karea tampil x dulu baru 100 + 1
    println(x) //hasil 100 karena baru dikurang jadi 101 - 1

    // 2. Assignment Operator - nggak boleh ada di println
    var y = 10
    y += 5
    println(y)
    y -= 3
    println(y)
    y *= 2
    println(y)
    y /= 4
    println(y)
    y %= 3
    println(y)


    // 3. Comparison Operator, untuk boolean
    val a = 10
    val b = 5
    println(a == b)
    println(a != b)
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)

    // 4. Logical Operator (&&, ||, !)
    val c = 1
    val d = 5
    val e = true
    println(c < 5 && d > 3) //true
    println(c < 5 || d < 4)
    println(!e)

}