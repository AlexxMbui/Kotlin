import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)
    print("Enter first number :")
    val firstNumber = input.nextInt()
    print("Enter second number :")
    val secondNumber = input.nextInt()
    print("Enter Action (+,-,*,/,%):")
    val choice = input.next()[0]
    val result = when(choice){
        '+'->firstNumber + secondNumber
        '-'->firstNumber - secondNumber
        '*'->firstNumber * secondNumber
        '/'->firstNumber / secondNumber
        '%'->firstNumber % secondNumber
        else -> {
            System.err.println("Invalid")
            return

        }

    }

print(result)
   


}