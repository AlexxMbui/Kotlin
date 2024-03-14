//parent class/super class/base class
open class animal{
    var age = 2
    var gender = "female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}
//child class / sub class/derived class
class duck:animal(){
    var colour = "white"
     fun sound(){
         println("Duck is quacking")
     }
}

class fish:animal(){
    var hasScales = true
    var hasFins = true

    fun eat(){
        println("Fish is eating")
    }


}

fun main() {
    var a =animal()
    var d = duck()
    var nileperch = fish()

    println(d.gender)
    d.move("swimming")

}




