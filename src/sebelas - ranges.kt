fun main() {
    //using in
    // will help a lot for looping with 'for'
    println("Range Character")
    for (chars in 'a' .. 'z'){
        if (chars >= 'f'){
            break
        }
        println(chars)
    } //chars is empty variable without type, jsut just

    println("Range Number")
    for (nums in 5 .. 15){
        if (nums % 2 == 0){
            continue
        }
        println(nums)
    }


}