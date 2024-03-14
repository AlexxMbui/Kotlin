class Person{
    //Attributes/properties
    var name = "John"
    var age = 67
    var gender = "Male"

    //Methods
    fun walk(){
        println("person is walking")
    }



}

fun main(){
    var accountant = Person()
    accountant.walk()

    println(accountant.gender)
    

}


