class dog(var name:String,var breed:String,var age:Int){

    fun move(movement:String){

        println("The dog is $movement")
    }

}
fun main(){
    var dog1 = dog("Bob","rottweiler",6)
    var dog2 = dog("Jack","chiwawa",5)
    var dog3 =dog("Allen","German shepherd",5)

    println(dog1.name)
    println(dog2.breed)

    dog1.move("walking")
    dog2.move("hopping")
}




