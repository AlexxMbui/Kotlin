fun main() {

    var greeting = "Hello world"
    var firstname = "Alex"
    var lastname = "Mbui"

    println(firstname)

    //string concatenation

    println(firstname + " " + lastname)
    println(firstname.plus(lastname))

    /*accessing an element in a string

     */
    println(greeting[6])

    //Determining the index position of an element

    println(greeting.indexOf("world"))
    println(greeting.indexOf('H'))

    //Modifying a string

    println(greeting.uppercase())

    //string interpolation

    println("Hello there, my name is $firstname $lastname")

    //size of a string

    println(greeting.length)



}