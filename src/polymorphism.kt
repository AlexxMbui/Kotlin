//parent class
open class shape{
    open fun draw(){
        println("Drawing a shape")
    }
}

//child class
class rhombus:shape(){
    override fun draw(){
        println("Drawing a rhombus")
    }
}

class parallelogram:shape(){
    override fun draw(){
        println("Drawing a parallelogram")
    }
}

fun main() {

    var s = shape()
    s.draw()
    var p = parallelogram()
    p.draw()
}



