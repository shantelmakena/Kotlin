import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter two numbers : ")
    var first = read.nextDouble()
    var second = read.nextDouble()

    println("Enter an operator( +,-,*,/) ;")
    var operator = read.next()[0]
    var result : Double

    when (operator){
        '+' -> result = first + second
        '-' -> result = first - second
        '*' -> result = first * second
        '/' -> result = first / second
        else-> {
           System.out.printf("Invalid operator")
            return

        }

        }
       System.out.printf("%.1f %c %.1f =%.1f", first, operator, second, result)

    }

