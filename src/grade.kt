fun main() {
    println("Enter the student's score :")
    val score = readLine()?.toIntOrNull()?:return

    val grade = when{
        score in 90..100 -> 'A'
        score in 85..89 ->"A"
        score in 70..79 ->"B"
        score in 60..69 ->"C"
        score in 50..59 ->"D"
        score in 40..49 ->"E"
        score in 1..39 ->"F"
        else->"invalid"

    }
   println("grade is $grade")

}