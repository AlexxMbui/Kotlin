fun main() {
    var languages = arrayOf("Kotlin","Javascript","Python","C++")

    println(languages[1])

    //reassigning an element in an array
    languages[1] = "PHP"

    println(languages[1])

    //looping through an array

    for (x in languages){
        println(x)


    }

    if ("PHP" in languages){
        println("it exists")

    }
    else{
        println("It does not exist")
    }







}