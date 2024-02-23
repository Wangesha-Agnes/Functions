fun main() {
    name("Wangesha")
modulus(7,2)
    addition(15,12,8,13)
    sentence("I love peace")
}

    fun name(word:String){
        var name="Hello $word"
        println(name)
    }

    fun modulus(num1:Int,num2:Int):Int{
        var modulus= num1%num2
        println(modulus)
        return modulus

    }
fun addition(num7:Int,num4:Int,num5:Int,num6:Int):Int{
    var addition= num7+num4+num5+num6
    println(addition)
    return addition
}
fun sentence(fact: String){
    println(fact)

}

