fun main() {
    //Predefined Functions
    println("Hello Kotlin")

    var x = Math.min(45,89)
    println(x)

    var y = Math.max(34,99)
    println("Maximum value equals $y")

    var z = Math.round(45.98)
    println(z)

    name()
    product(12,30)
    product(4,30)
    details("Jack",35)
    details("Caleb",25)




}

//User defined function
fun name(){

    println("Alex")

}

fun product(num1:Int, num2 : Int){

    println(num1*num2)
}

fun details(name:String,age:Int){
    println("$name is $age")


}





